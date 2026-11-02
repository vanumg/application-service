package com.document.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationDTO {

	private String name;

	private String reportType;

	private String landingZone;

	private String lbu;

	public String getName() {
		return name;
	}

}
