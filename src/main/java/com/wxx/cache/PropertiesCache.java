package com.wxx.cache;

import com.wxx.entity.Properties;

public interface PropertiesCache {
	/**
	 * 初始化PropertiesCache
	 */
	void init();

	/**
	 * 获取主键对应的实体Bean
	 * 
	 * @param propertiesKey
	 *            主键
	 * @return 主键对应的实体Bean
	 */
	Properties get(String propertiesKey);

	/**
	 * 将Properties新增到cache中
	 * 
	 * @param propertiesKey
	 *            主键
	 * @param properties
	 *            主键对应的实体Bean
	 */
	void add(String propertiesKey, Properties properties);

	/**
	 * 重新加载PropertiesCache
	 */
	void reload();
}
