package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitltemEditController {

	//最初のページ
	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String gititemedit() {
		return "gititemedit";
	}

	@RequestMapping(path = "/gititemedit_second", method = RequestMethod.POST)
	public String gititemedit_second(String myname, int myprice, Model model) {

		model.addAttribute("myname", myname);
		model.addAttribute("myprice", myprice);

		return "gititemedit_second";
	}

}