package com.document.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.document.Entity.Application;
import com.document.dto.ApplicationDTO;
import com.document.service.ApplicationServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {
	 private static final Logger log =
	            LoggerFactory.getLogger(ApplicationController.class);

	private final ApplicationServiceImpl applicationServiceImpl;

	ApplicationController(ApplicationServiceImpl applicationServiceImpl) {
		this.applicationServiceImpl = applicationServiceImpl;
	}

	@GetMapping("/applications/{id}")
	public Application getApplicationById(@PathVariable int id) throws IOException {

		log.info("Creating order with id: {id}\", application id");
		return applicationServiceImpl.getApplicationById(id);
	}

	@PostMapping("/application")
	public ResponseEntity<Application> saveApplication(@RequestBody ApplicationDTO dto) {
		Application application = applicationServiceImpl.saveApplication(dto);
		log.info("Creating Appliction ");
		return ResponseEntity.status(HttpStatus.CONFLICT).body(application);
	}

}
