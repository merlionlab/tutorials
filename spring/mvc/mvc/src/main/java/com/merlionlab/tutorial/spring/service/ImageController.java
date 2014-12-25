package com.merlionlab.tutorial.spring.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merlionlab.tutorial.spring.pojo.Image;

@RestController
public class ImageController {

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public Image getImage() {
		Image image = new Image();
		image.setPathUri("http://www.w3schools.com/images/w3logotest2.png");
		image.setMimeType("image/png");
		return image;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTest() {
		return "Hello World!!";
	}
}
