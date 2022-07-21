package com.zensarspringbootdemo.service;

import java.util.List;
import com.zensarspringbootdemo.entity.Details;

public interface UserService {

	public Details getDetails(int userId);

	public List<Details> getAllDetails(Details details);

	public Details insertDetails(Details details);

	public Details deleteDetails(int userId);

}
