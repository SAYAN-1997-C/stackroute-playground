package com.stackroute.moviejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.moviejpa.filter.Moviefilter;
 

@SpringBootApplication
public class MovieJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieJpaApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean getfilter()
	{
		FilterRegistrationBean fbean=new FilterRegistrationBean();
		fbean.setFilter(new Moviefilter());
		fbean.addUrlPatterns("/movie/addactor");
		return fbean;
	}

}
