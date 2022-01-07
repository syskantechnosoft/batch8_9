package com.cts.springdata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springdata.model.Associates;

@RestController
public class FirstController {

	@RequestMapping("/hello") // end point (using http get method)
	public String welcome() {
		return "Welcome to Spring Boot";
	}

	@GetMapping("/names")
	public List<String> getNamelist() {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Drillon");
		nameList.add("Ahmed");
		nameList.add("Kim");
		nameList.add("Solofo");
		nameList.add("Luca");
		nameList.add("Patrick");
		nameList.add("Jonas");

		return nameList;
	}

	@GetMapping("/associates")
	public List<Associates> getAssociates() {
		Associates a1 = new Associates(1001, "Drillon", "Drillon@gmail.com", 9878672367l);
		Associates a2 = new Associates(1002, "Ahmed", "Ahmed@gmail.com", 9878672367l);
		Associates a3 = new Associates(1003, "Kim", "Kim@gmail.com", 9878672367l);
		Associates a4 = new Associates(1004, "Solofo", "Solofo@gmail.com", 9878672367l);
		Associates a5 = new Associates(1005, "Luca", "Luca@gmail.com", 9878672367l);
		Associates a6 = new Associates(1006, "Patrick", "Patrick@gmail.com", 9878672367l);
		Associates a7 = new Associates(1007, "Jonas", "Jonas@gmail.com", 9878672367l);
//		Associates a1 = new Associates(100,"Drillon", "Drillon@gmail.com", 9878672367l);
		List<Associates> associates = new ArrayList<Associates>();
		associates.add(a1);
		associates.add(a2);
		associates.add(a3);
		associates.add(a4);
		associates.add(a5);
		associates.add(a6);
		associates.add(a7);
		return associates;
	}
}
