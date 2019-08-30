package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import model.test;
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
	@RequestMapping("delete")
	public String delete(int id) {
		service.delete(id);
		return "redirect:/test/index.action";
	}
	@RequestMapping("insert")
	public String insert(test t) {
		service.insert(t);
		return "redirect:/test/index.action";
	}
	@RequestMapping("update")
	public String update(test t) {
		service.update(t);
		return "redirect:/test/index.action";
	}
	@RequestMapping("edit")
	public String edit(Integer id,ModelMap m){
		if(id!=null) {
			test t = service.selectbyid(id);
			m.put("info", t);
		}
		return "edit";
	}
	
}
