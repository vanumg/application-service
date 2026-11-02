package com.document.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String reportType;

	private String landingZone;

	private String lbu;

	public Application() {

	}

	public Application(Integer id, String name, String reportType, String landingZone, String lbu) {
		super();
		this.id = id;
		this.name = name;
		this.reportType = reportType;
		this.landingZone = landingZone;
		this.lbu = lbu;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getLandingZone() {
		return landingZone;
	}

	public void setLandingZone(String landingZone) {
		this.landingZone = landingZone;
	}

	public String getLbu() {
		return lbu;
	}

	public void setLbu(String lbu) {
		this.lbu = lbu;
	}

}
