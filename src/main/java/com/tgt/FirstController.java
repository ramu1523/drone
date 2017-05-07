package com.tgt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(value="/{value}")
	public String firstMethod(@PathVariable("value") String value)
	{
		System.out.println("Hello "+value);
		return "Hello "+value+"\n";
	}

}
