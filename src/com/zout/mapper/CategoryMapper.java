package com.zout.mapper;
 
import java.util.List;

import com.zout.pojo.Category;
 
/**
 *@class_name：CategoryMapper  
 *@param: mapper/DAO接口实现数据库操作
 *@return: 
 *@author:Zoutao
 *@createtime:2018年2月8日
 */

public interface CategoryMapper {
 
	//增-对应Category.xml文件的parameterType名
    public int add(Category category);  
       
    //删-对应Category.xml文件的parameterType名
    public void Category(int id);  
       
    //查-对应mapper.xml文件的parameterType名
    public Category get(int id);  
     
    //更新-对应Category.xml文件的parameterType名
    public int update(Category category);   
            
    //查询全部的话，以列表的形式来
    public List<Category> list();
    
    public int count();  
     
}