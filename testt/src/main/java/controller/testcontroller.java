package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class testcontroller {

	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("x1", "aaaaaaaaaaaaaaa");
		return "index";
	}
}
