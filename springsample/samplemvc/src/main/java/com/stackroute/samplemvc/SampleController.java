package com.stackroute.samplemvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping("/")
	public String getHome()
	{
		return "index";
	}

}
