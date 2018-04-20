package com.wxx.service;

import java.util.Map;

import com.wxx.entity.Weixx;

public interface IWeixxService {

	public String getC1Serv();

	public Weixx getC1Serv(String id);

	public Weixx getC1Serv(String id, String username);

	public Weixx getC1Serv(Map<String, String> map);

	public void add(Weixx weixx);

	public void update(Weixx weixx);

	public void delete(String id);
}
