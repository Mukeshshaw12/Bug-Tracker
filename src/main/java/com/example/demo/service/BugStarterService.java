package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StarterRepository;
import com.example.demo.entity.Starter;


@Service
public class BugStarterService {
	
	
	@Autowired
	StarterRepository starterRepository;
	public void saveUser(@Valid Starter starter) {
		
		         starterRepository.save(starter);
		
	}
	public Iterable<Starter> getStarter() {
		return starterRepository.findAll();
	}
	
	

}
