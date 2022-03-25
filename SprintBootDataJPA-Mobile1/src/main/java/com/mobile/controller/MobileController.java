package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	MobileService service;
	
	@PostMapping("/addMobile")
	public Mobile addMobile(@RequestBody Mobile mobile) {
		return service.addMobile(mobile);
	}
	
	@PutMapping("/updateMobile")
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return service.updateMobile(mobile);
	}
	
	@GetMapping("/getMobile/{id}")
	public Optional<Mobile> getMobile(@PathVariable("id") int mid) {
		return service.getMobile(mid);
	}
	
	@GetMapping("/getAllMobile")
	public Iterable<Mobile> getAllMobile() {
		return service.getAllMobiles();
	}
	
	@DeleteMapping("/deleteMobile/{id}")
	public void deleteMobile(@PathVariable("id") int mid) {
		service.deleteMobile(mid);
	}
	
	
}
