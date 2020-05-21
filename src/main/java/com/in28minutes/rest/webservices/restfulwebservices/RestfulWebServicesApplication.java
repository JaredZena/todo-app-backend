package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestfulWebServicesApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	
	  /**
	  * CORS registry
	  */
	 @Override
	 public void addCorsMappings(CorsRegistry registry) {
		 // adding cors registry to all controller methods mappings
	     registry.addMapping("/**")
	     //setting allowed origins all
	     .allowedOrigins("*")
	     //setting allowed methods
	     .allowedMethods("GET","PUT","POST","DELETE");
	 }
}
