package com.wxx.aspect;

import java.util.HashMap;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.wxx.cache.PropertiesCache;
import com.wxx.entity.Properties;

@Aspect
public class LogAspect {

	@Autowired
	private PropertiesCache propertiesCache;

	@AfterReturning(value = "execution(* com.wxx.service.impl.IWeixxServiceImpl.getC1Serv(..))", returning = "dataMap")
	public void log(HashMap<String, Object> dataMap) {
		Properties properties = propertiesCache.get("0");
		String tranLogFlag = null;
		if (null != properties) {
			tranLogFlag = properties.getPropertyValue();
		}
		if (null != tranLogFlag && "0".equals(tranLogFlag.trim())) {
			System.out.println(">>>>>>>>log>>>>>");
		}

	}

	@AfterReturning("execution(* com.wxx.service.impl.IWeixxServiceImpl.getC1Serv(..)) && args(dataMap,flag)")
	public void log(HashMap<String, Object> dataMap, boolean flag) {

		System.out.println(">>>>>>>>log>>>>>");
	}

}
