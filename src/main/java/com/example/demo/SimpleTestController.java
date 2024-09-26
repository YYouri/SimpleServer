package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SimpleTestController {
	
	//http://localhost:8081/api/getParam?id=test&password=1234
	@GetMapping("/getParam")
	  public String getParameter(@RequestParam(name = "id")  String id, @RequestParam(name = "password") String pwd) {
	    return "IDDDDD: " + id + ", Passworddddd: " + pwd;
	  }
	
	//http://localhost:8081/api/getMethod2
	  @RequestMapping(method = RequestMethod.GET, path = "/getMethod1")
	  public String getRequest() {
	    return "Hello Spring1";
	  }
	  @GetMapping("/getMethod2")
	  public String getParameter() {
	    return "Hello Spring2";
	  }

}
