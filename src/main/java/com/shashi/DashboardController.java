package com.shashi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

@GetMapping("/msg")
	public String getMessages() {
		
		String msg="This is myTest of Jenkins form 2 nd Test ";
		return msg;
	}
}
