package com.mobiquity.codingchallenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.codingchallenge.modal.ATM;

@RestController("/api")
public class ATMController {
	
	@GetMapping("/getAll")
	public List<ATM> getAllAtms(){
		List<ATM> atmList = new ArrayList<>();
		return atmList;
	}
	
	@GetMapping("/getATMByCity/{cityName}")
	public ATM getATMByCity() {
		return new ATM();
	}
	
}
