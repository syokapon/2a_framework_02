package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String homelogin() {
		return "gitlogin";
	}
	
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String homelogin(String ID, String PW, Model model) {
		model.addAttribute(ID);
		model.addAttribute(PW);
		if("gitlogin".equals(ID)&&"gitpw".equals(PW)) {
			return "redirect:/gititemlist";
		}else {
			return "redirect:/gitlogin";
		}
	}
}
