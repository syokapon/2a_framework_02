package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class gitltemEditController {

	//最初のページ
	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String sixth() {
		return "gititemedit";
	}

	@RequestMapping(path = "/gititemedit_second", method = RequestMethod.POST)
	public String sixth(String myname, int myprice, RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("myname", myname);
		redirectAttributes.addFlashAttribute("myprice", myprice);

		//ページを跨ぎたい時は、
		//「redirect:/xxx」を使って移動先のGETメソッドのURLを使う。
		return "redirect:/gititemedit_second";
	}

}