package com.practice.AwsCodePipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
	
	@GetMapping("/data")
	public String getData() {
		return "Currently in AWS code Pipeline :)";
	}
	
	@GetMapping("/pipepline")
	public String getData2() {
		return "Currently in new AWS code Pipeline :) :) :)";
	}

}
