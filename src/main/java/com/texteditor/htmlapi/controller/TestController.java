package com.texteditor.htmlapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.texteditor.htmlapi.model.Data;

@Controller
public class TestController {
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@PostMapping("/insertdata")
	public ModelAndView insertdata(Data data)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("viewData", data);
		mv.setViewName("data");
		
		return mv;
	}

}
