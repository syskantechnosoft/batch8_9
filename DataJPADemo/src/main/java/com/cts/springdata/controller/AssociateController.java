package com.cts.springdata.controller;

import java.util.List;
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

import com.cts.springdata.model.Associates;
import com.cts.springdata.repo.AssociateRepo;
import com.cts.springdata.service.AssociateService;

@RestController

public class AssociateController {
	
	@Autowired
	AssociateService  associateService;
	
	@GetMapping("/associates1")
	public List<Associates> getAll() {
		return associateService.findAll();
	}

	@GetMapping("/associates1/{id}")
	public Optional<Associates> getById(@PathVariable int id) {
		return associateService.findById(id);
	}
	
	@PostMapping("/associates1")
	public void addAssociate(@RequestBody Associates associates) {
		associateService.addAssociate(associates);
	}
	
	@PutMapping("/associates1/{id}")
	public void updateAssociate(@PathVariable int id,@RequestBody Associates associate) {
		associateService.updateAssociate(id, associate);
	}
	
	@DeleteMapping("/associates1/{id}")
	public void deleteAssociate(@PathVariable int id) {
		associateService.deleteAssociate(id);
	}
}
