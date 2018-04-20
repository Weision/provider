/**
 * 
 */
package com.wxx.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wxx.entity.Properties;
import com.wxx.mapper.PropertiesMapper;

@Service("propertiesService")
public class PropertiesService {
	
	@Resource
	private PropertiesMapper propertiesMapper;

	public Properties getPropertiesByKey(String propertyKey) {
		return propertiesMapper.getPropertiesByKey(propertyKey);
	}

	public HashMap<String, Properties> getPropertiess() {
		HashMap<String, Properties> propertiess = null;
		List<Properties> list = propertiesMapper.getPropertiess();
		if (null != list && list.size() > 0) {
			int length = list.size();
			propertiess = new HashMap<String, Properties>(length);
			for (int i = 0; i < length; ++i) {
				Properties properties = list.get(i);
				propertiess.put(properties.getPropertyKey(), properties);
			}
		} else {
			propertiess = new HashMap<String, Properties>(0);
		}
		return propertiess;
	}
}
