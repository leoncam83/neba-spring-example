package com.ttn.aem.osgispringhelloworld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ttn.aem.osgispringhelloworld.services.HelloWorldService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return helloWorldService.sayHello();
	}
	
	@RequestMapping(value="/letters",method=RequestMethod.GET)
	public List<String> sayHelloTo(){
		return helloWorldService.sayHelloTo();
	}
}