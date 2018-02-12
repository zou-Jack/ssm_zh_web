package com.zout.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.zout.pojo.Category;

/**
 *@class_name：CategoryService  
 *@param: 业务逻辑处理层
 *@return: 
 *@author:Zoutao
 *@createtime:2018年2月8日
 */
@Service
public interface CategoryService {
	
	//查询全部数据
	List<Category> list();

}
