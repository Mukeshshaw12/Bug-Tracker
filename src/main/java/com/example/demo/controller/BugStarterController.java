package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Starter;
import com.example.demo.service.BugStarterService;

@RestController
public class BugStarterController {
	
	@Autowired
	BugStarterService starterService;
	
	@PostMapping("/starter")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createStarter(@RequestBody @Valid Starter starter) {
		starterService.saveUser(starter);
		
	}
	
	@GetMapping("/starter")
	Iterable<Starter> getStarter() {
		return starterService.getStarter();
	
	}

}
