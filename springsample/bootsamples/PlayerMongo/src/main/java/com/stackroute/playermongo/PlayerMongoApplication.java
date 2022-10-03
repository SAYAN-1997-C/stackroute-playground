package com.stackroute.playermongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.playermongo.filter.MyFilter;

@SpringBootApplication
public class PlayerMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerMongoApplication.class, args);
	}
	
	
	@Bean
	public FilterRegistrationBean getfilter()
	{
		FilterRegistrationBean fbean=new FilterRegistrationBean();
		fbean.setFilter(new MyFilter());
		fbean.addUrlPatterns("/player/addPlayer","/player/viewbycountry/*");
		return fbean;
	}

}
