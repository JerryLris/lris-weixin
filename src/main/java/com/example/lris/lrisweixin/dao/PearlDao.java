package com.example.lris.lrisweixin.dao;

import java.util.List;

import com.example.lris.lrisweixin.entity.Pearl;

public interface PearlDao {

	/**
	 * 列出列表
	 * 
	 * @return pearlList
	 */
	List<Pearl> queryPearl();
	
	/**
	 * 分页
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Pearl> getUserPearlByLimit(int start,int limit);

	/**
	 * 根据Id列出具体
	 * 
	 * @return pearl
	 */
	Pearl queryPearlById(int pearlId);

	/**
	 * 插入 
	 * 
	 * @param pearl
	 * @return
	 */
	int insertPearl(Pearl pearl);

	/**
	 * 更新 
	 * 
	 * @param pearl
	 * @return
	 */
	int updatePearl(Pearl pearl);

	/**
	 * 删除 
	 * 
	 * @param pearlId
	 * @return
	 */
	int deletePearl(int pearlId);
}
