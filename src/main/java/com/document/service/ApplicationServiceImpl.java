package com.document.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.document.Entity.Application;
import com.document.dto.ApplicationDTO;
import com.document.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl {

	private final ApplicationRepository applicationRepository;

	ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	public Application saveApplication(ApplicationDTO dto) {

		System.out.println(dto.getLandingZone());
		Application app = new Application();
		app.setLandingZone(dto.getLandingZone());
		app.setLbu(dto.getLbu());
		app.setReportType(dto.getReportType());

		return applicationRepository.save(app);
	}

	public Application getApplicationById(int id) throws IOException {
		return applicationRepository.findById(id).get();
	}

}
