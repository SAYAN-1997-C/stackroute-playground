package com.stackroute.librarymvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.librarymvc.model.Book;

@Controller
public class LibraryController {

	
	
	@GetMapping("/")
	public String getHome()
	{
		return "index";
	}
	
	
//	@PostMapping("/savebook")
//		public String saveBook(@RequestParam("bookid") String bid,@RequestParam("bookname") String bname)
//	{
//		
//		System.out.println("Book name is " + bname) ;
//		
//		
//		return "success";
//		
//	}

	@PostMapping("/savebook")
	public String saveBook(@ModelAttribute("bookattri") Book bookobj,ModelMap mymap)
	{
		mymap.put("status", bookobj.getBookname() + "  Added ");
		   return "index";
	}
	
	
	
	
	
}
