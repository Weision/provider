package com.wxx.cache.impl;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wxx.cache.PropertiesCache;
import com.wxx.entity.Properties;
import com.wxx.service.impl.PropertiesService;

@Component
public class PropertiesCacheImpl implements PropertiesCache {
	@Autowired
	private PropertiesService propertiesService;

	private volatile ConcurrentHashMap<String, Properties> propertiesCacheMap = new ConcurrentHashMap<String, Properties>();
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PropertiesCacheImpl.class);

	@Override
	@PostConstruct
	public synchronized void init() {
		LOGGER.info("数据加载开始--类:{}", PropertiesCacheImpl.class.getName());
		propertiesCacheMap = new ConcurrentHashMap<String, Properties>(
				this.propertiesService.getPropertiess());
	}

	@Override
	public Properties get(String propertiesKey) {
		Properties properties = this.propertiesCacheMap.get(propertiesKey);
		if (null == properties) {
			properties = this.propertiesService
					.getPropertiesByKey(propertiesKey);
			if (null != properties) {
				this.add(propertiesKey, properties);
			}
		}
		return properties;
	}

	@Override
	public void add(String propertiesKey, Properties properties) {
		this.propertiesCacheMap.putIfAbsent(propertiesKey, properties);
	}

	@Override
	public void reload() {
		this.init();
	}
}
