package com.zensarspringbootdemo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Details getDetails(int userId) {

		return userRepository.findById(userId).get();
	}

	@Override
	public List<Details> getAllDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userRepository.findAll();
		System.out.println("impl " + list);

		return list;
	}

	@Override
	public List<Details> updateDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userRepository.findAll();
		System.out.println("impl " + list);

		return list;
	}

	@Override
	public List<Details> addDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userRepository.findAll();
		System.out.println("impl " + list);

		return list;
	}

	@Override
	public List<Details> deleteDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userRepository.findAll();
		System.out.println("impl " + list);

		return list;
	}

}
