package com.zensarspringbootdemo.service;

import java.util.List;

import com.zensarspringbootdemo.entity.Details;

public interface UserService {

	public Details getDetails(int userId);

	public List<Details> getAllDetails();

	public List<Details> updateDetails();

	public List<Details> addDetails();

	public List<Details> deleteDetails();

	

}
