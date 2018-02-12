package com.zout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zout.pojo.Category;
import com.zout.service.CategoryService;

/**
 *@class_name：CategoryController  
 *@param: 控制层的控制器类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年2月12日
 */
//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	//当url处于这个时，由listCategory方法来处理请求
	@RequestMapping("listCategory")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

}
