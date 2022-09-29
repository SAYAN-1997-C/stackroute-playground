package com.stackroute.firstboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/home")
	public ResponseEntity<?> getHome()
	{
		return new ResponseEntity<String>("Hello world",HttpStatus.OK);
	}

	//endpoint
	@GetMapping("/view")
	public ResponseEntity<?> showview()
	{
		return new ResponseEntity<String>("some data print here",HttpStatus.OK);
	}

	
}
