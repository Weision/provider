package com.wxx.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogJdbcUtil {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(LogJdbcUtil.class);

	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "config/spring/applicationContext-datasource.xml" });

	private static DataSource dataSource = (DataSource) context
			.getBean("dataSource");

	public void insertTranLogs(String tranLog) {
		Connection conn = null;
		Statement stat = null;
		PreparedStatement prest = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			// this.getConn();
			String sql = "INSERT b_log(id,uuid, name, method, instance) VALUES(?,?,?,?,?)";
			prest = conn.prepareStatement(sql);
			prest.setInt(4, 1);
			LOGGER.info("prest对象信息: " + prest);
			prest.executeUpdate();
			LOGGER.info("插入TranLog: " + tranLog + " 成功！");
		} catch (Throwable ex) {
			LOGGER.info("插入TranLog: " + tranLog + " 失败！", ex);
		} finally {
			this.close(rs, stat, prest, conn);
		}

	}

	private void close(ResultSet rs, Statement st, PreparedStatement ps,
			Connection conn) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				LOGGER.error("关闭ResultSet异常", e);
			}
		}
		if (null != st) {
			try {
				rs.close();
			} catch (SQLException e) {
				LOGGER.error("关闭Statement异常", e);
			}
		}
		if (null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				LOGGER.error("关闭PreparedStatement异常", e);
			}
		}
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				LOGGER.error("关闭Connection异常", e);
			}
		}
	}
}
