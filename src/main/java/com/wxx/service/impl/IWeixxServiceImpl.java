package com.wxx.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import com.wxx.entity.Weixx;
import com.wxx.mapper.WeixxMapper;
import com.wxx.service.IWeixxService;

public class IWeixxServiceImpl implements IWeixxService {

	@Resource
	WeixxMapper weixxMapper;

	public Weixx getC1Serv(String id) {
		System.out.println(">>>>stert>>>>>>>>");
		return weixxMapper.selectWeixxById(id);
	}

	public Weixx getC1Serv(String id, String username) {
		return weixxMapper.selectWeixxByIu(id, username);
	}

	public Weixx getC1Serv(Map<String, String> map) {
		return weixxMapper.selectWeixxByMap(map);
	}

	public void add(Weixx weixx) {
		weixxMapper.addWeixx(weixx);
	}

	public void update(Weixx weixx) {
		weixxMapper.updateWeixx(weixx);
	}

	public void delete(String id) {
		weixxMapper.deleteWeixx(id);
	}

	@Override
	public String getC1Serv() {
		return "weixx";
	}
}
