package com.haoge.cloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haoge.cloud.entities.Dept;
import com.haoge.cloud.service.DeptClientService;

/**
 * @author 李东浩
 * @Date：2018年4月29日下午3:22:47
 *
 */
@RestController
public class DeptController_Consumer {
//		@Autowired
	private DeptClientService service;
	
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		
		return this.service.get(id);
		
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list() {
		
		return this.service.list();
		
	}
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		
		return this.service.add(dept);
		
	}
}
