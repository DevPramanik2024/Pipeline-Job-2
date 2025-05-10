package com.ninja.Pipeline_Spring_Boot_Job_2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pipelinejob2
{
	@RequestMapping("/test")
	public String test()
	{
		return "This is test page";
	}
	
	@RequestMapping("/pipeline")
	public String pipeline()
	{
		return "This is pipeline page";
	}
}
