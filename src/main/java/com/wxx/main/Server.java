package com.wxx.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 建立socket服务和端口监听 该类专门提供给dubbo服务
 *
 */
public class Server {

	private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		try {
			LOGGER.info("double server begin start-up...");
			context = new ClassPathXmlApplicationContext(
					"/dubbo/dubbo-provider.xml", "/dubbo/dubbo-consumer.xml");
			context.start();
			LOGGER.info("server start-up success...");
			System.in.read();
		} catch (Exception ex) {
			LOGGER.error("服务启动出错！", ex);
			LOGGER.info("server start-up error");
			System.exit(0);
		}

	}

	public static ApplicationContext getContext() {
		return context;
	}

}
