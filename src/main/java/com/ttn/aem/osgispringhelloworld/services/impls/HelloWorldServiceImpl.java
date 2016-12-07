package com.ttn.aem.osgispringhelloworld.services.impls;

import java.util.Arrays;
import java.util.List;

import com.ttn.aem.osgispringhelloworld.services.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String sayHello() {
		return "HelloWorld!";
	}

	@Override
	public List<String> sayHelloTo() {
		return Arrays.asList(new String[]{"A","B","C"});
	}

}
