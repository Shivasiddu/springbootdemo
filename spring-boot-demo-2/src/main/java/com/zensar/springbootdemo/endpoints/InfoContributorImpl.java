package com.zensar.springbootdemo.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoContributorImpl implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> studentDetails = new HashMap<String, Object>();
		studentDetails.put("CreatedBy", "shiva");
		studentDetails.put("CreatedBy", "siddu");
		studentDetails.put("ModifiedOn", "22june2022");
		// builder.withDetails(studentDetails);
		builder.withDetail("Student", studentDetails);

	}

}