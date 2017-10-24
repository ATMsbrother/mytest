package cn.itcast.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@RestController注解:其实就是@Controller和@ResponseBody注解加在一起
public class HelloController {
	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello(){
		return "hello world";	
	}
}
