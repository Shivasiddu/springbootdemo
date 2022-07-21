package com.zensarspringbootdemo.service;

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
	public List<Details> getAllDetails(Details details) {

		return userRepository.findAll();
	}

	@Override
	public Details insertDetails(Details details) {

		return userRepository.save(details);
	}

	@Override
	public Details deleteDetails(int userId) {
		return userRepository.deleteDetails(userId);

	}

}
