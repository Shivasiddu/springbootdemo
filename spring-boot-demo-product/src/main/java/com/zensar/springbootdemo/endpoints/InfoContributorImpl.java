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
		Map<String, Object> productDetails = new HashMap<String, Object>();
		productDetails.put("CreatedBy", "shiva");
		productDetails.put("CreatedBy", "siddu");
		productDetails.put("ModifiedOn", "22june2022");
		// builder.withDetails(studentDetails);
		builder.withDetail("product", productDetails);

	}

}