package com.stackroute.librarymvc.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.librarymvc.model.Book;
import com.stackroute.librarymvc.repo.BookRepo;

@Controller
public class LibraryController {

	ApplicationContext appcontext=new ClassPathXmlApplicationContext("beans.xml");
	BookRepo repo=appcontext.getBean("repobean",BookRepo.class);
	
	
	
	@GetMapping("/")
	public String getHome(ModelMap mymap)
	{
		
		 List<Book> books=repo.getBooks();	
			
			mymap.put("booklist", books);
		
		
	
		
		
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
		
		repo.addBook(bookobj);
	  
		   return "redirect:/";
	}
	
	
	@GetMapping("/deletebook")
	public String deleteBook(@RequestParam("bookid") String bid,ModelMap mymap)
	{
		repo.deleteBook(bid);
		
		return "redirect:/";
		  
	}
	
	
	
	
	
	
}
