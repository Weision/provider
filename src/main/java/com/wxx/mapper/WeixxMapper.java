package com.wxx.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wxx.entity.Weixx;

/*
 * 这里面的方法名必须与 weixxMapper.xml中sql的id一致
 */
@Repository
public interface WeixxMapper {
	

	
	public Weixx selectWeixxById(String id);

	public Weixx selectWeixxByIu(String id, String username);

	/**
	 * Map也不需要使用@Param注解 
	 * 在xml中直接写map中的key即可
	 */
	public Weixx selectWeixxByMap(Map<String, String> map);

	public List<Weixx> selectWeixxs(String userName);

	public void addWeixx(Weixx weixx);

	public void updateWeixx(Weixx weixx);

	public void deleteWeixx(String id);

}
