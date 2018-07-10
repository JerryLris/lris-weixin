package com.example.lris.lrisweixin.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lris.lrisweixin.dao.PearlDao;
import com.example.lris.lrisweixin.entity.Pearl;

@RestController
@RequestMapping("/pearlseven")
public class PearlSevenController {

	@Resource
	private PearlDao pearlDao;
	
	/**
	 * 获取珍珠列表
	 * @return
	 */
	@RequestMapping(value="/listpearl",method=RequestMethod.GET)
	public Map<String, Object> getList(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Pearl> list = new ArrayList<Pearl>();
		list = pearlDao.queryPearl();
		modelMap.put("areaList", list);
		return modelMap;
	}
	/**
	 * 获取珍珠列表
	 * @return
	 */
	@RequestMapping(value="/getUserPearlByLimit",method=RequestMethod.GET)
	public Map<String, Object> getUserPearlByLimit(
			@RequestParam(value="page",defaultValue="1",required=true) Integer page,
			@RequestParam(value="size",defaultValue="5",required=true) Integer size){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Pearl> list = new ArrayList<Pearl>();
		list = pearlDao.getUserPearlByLimit(page, size);
		modelMap.put("areaList", list);
		return modelMap;
	}
}
