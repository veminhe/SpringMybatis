package com.tronker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tronker.service.TestService;

@Controller
@RequestMapping(value="/router")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping(value="test",method=RequestMethod.GET,produces="application/json; charset=utf-8")
	@ResponseBody
	public String getTest(@RequestParam(name="id") String id){
		//return testService.getTest(id);
		return "abc";
	}
}
