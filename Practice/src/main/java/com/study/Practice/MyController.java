package com.study.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@Autowired
	UserDao userdao;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name","홍길동");
		
		return "test1";
	}
	@RequestMapping(value="test4",method=RequestMethod.GET)
	public String test4(Model model) {
		model.addAttribute("list",userdao.list());
		
		return "test4";
	}
	
}
