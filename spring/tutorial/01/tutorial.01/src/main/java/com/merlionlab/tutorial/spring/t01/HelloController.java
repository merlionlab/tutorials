package com.merlionlab.tutorial.spring.t01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public String getDefaultMessage(ModelMap model) {
		
		System.out.println("getDefaultMessage is called.");
		System.out.println(new XStream(new DomDriver()).toXML(model));
		
		model.addAttribute("text", "Hello World!");
		
		return "message";
	}
}
