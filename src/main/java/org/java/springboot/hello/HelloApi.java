package org.java.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}
}
