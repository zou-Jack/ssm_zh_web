package com.zout.pojo;


/**
 *@class_name：Category  
 *@param: 数据库字段属性
 *@return: javabean实体类
 *@author:Zoutao
 *@createtime:2018年2月8日
 */
public class Category {
	
	private int id;   //id
	private String name; //name
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
}
