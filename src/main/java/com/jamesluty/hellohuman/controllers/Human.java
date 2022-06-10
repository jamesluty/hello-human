package com.jamesluty.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	
	@GetMapping("/human")
	public String human(@RequestParam(value="fn", required=false) String firstName, @RequestParam(value="ln", required=false) String lastName, @RequestParam(value="c", required=false) Integer count) {
		String name = "";	
		if(count != null && firstName != "human") {
			for(int i=0; i<count; i++) {
				name += firstName + " " + lastName + ", ";
			}
		} else {
			name = "human";
		}
		return "My name is " + name + ".";
	}
}
