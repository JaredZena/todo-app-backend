package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * this class is used to avoid cors registry exceptions in frontend
 * @author Z064957 Jared
 *
 */
public class CorsConfig implements WebMvcConfigurer {

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
