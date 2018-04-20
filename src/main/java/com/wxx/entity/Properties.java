package com.wxx.entity;

import java.io.Serializable;

public class Properties implements Serializable {
	/**
	 * 数据字典表序列化
	 */
	private static final long serialVersionUID = -7707740368892834152L;
	/**
	 * 数据字典键
	 */
	private String propertyKey;
	/**
	 * 数据字典值
	 */
	private String propertyValue;

	/**
	 * @return the {@link #propertyKey}
	 */
	public String getPropertyKey() {
		return propertyKey;
	}

	/**
	 * @param propertyKey
	 *            the {@link #propertyKey} to set
	 */
	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	/**
	 * @return the {@link #propertyValue}
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * @param propertyValue
	 *            the {@link #propertyValue} to set
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((propertyKey == null) ? 0 : propertyKey.hashCode());
		result = prime * result
				+ ((propertyValue == null) ? 0 : propertyValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Properties other = (Properties) obj;
		if (propertyKey == null) {
			if (other.propertyKey != null) {
				return false;
			}
		} else if (!propertyKey.equals(other.propertyKey)) {
			return false;
		}
		if (propertyValue == null) {
			if (other.propertyValue != null) {
				return false;
			}
		} else if (!propertyValue.equals(other.propertyValue)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Properties [propertyKey=" + propertyKey + ", propertyValue="
				+ propertyValue + "]";
	}

}
