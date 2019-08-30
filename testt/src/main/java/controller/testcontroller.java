package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import service.test_service;

@Controller
@RequestMapping("test")
public class testcontroller {

	@Autowired
	test_service service;
	
	@RequestMapping("index")
	public String select(String txt,ModelMap m) {
		m.put("list", service.selectbyname(txt));
		return "index";
	}
	
	
}
