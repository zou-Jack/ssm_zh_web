package com.zout.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zout.mapper.CategoryMapper;
import com.zout.pojo.Category;
import com.zout.service.CategoryService;


/**
 *@class_name：CategoryServiceImpl  
 *@param:业务逻辑处理的具体实现类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年2月12日
 */
@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	//具体的实现方法
	public List<Category> list(){
		return categoryMapper.list();
	};

}
