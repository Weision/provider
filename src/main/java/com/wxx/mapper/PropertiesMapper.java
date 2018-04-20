package com.wxx.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wxx.entity.Properties;

@Repository
public interface PropertiesMapper {

	Properties getPropertiesByKey(String propertyKey);

	List<Properties> getPropertiess();
}