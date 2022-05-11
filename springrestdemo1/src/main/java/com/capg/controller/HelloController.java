package com.capg.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Student;

@RestController
@RequestMapping("/rest")
public class HelloController {

	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	@GetMapping("/hello")
	
	public ModelAndView hello() {
		
		ModelAndView mv = new ModelAndView();
		String result = "welcome to spring rest module and git";
		mv.addObject("res", result);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping(value="/getInfo",produces="application/json")
	public ModelAndView getData() {
		
		ModelAndView mv = new ModelAndView();
		Student stu = new Student();
		stu.setStid(100);
		stu.setStname("atiya");
		
		mv.addObject("res", stu);
		mv.setViewName("result");
		return mv;
	}
}




   