package com.zentest.test.webTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {

	@RequestMapping("test1")
	public String Test1() {
		return "test1";
	}
	
}
