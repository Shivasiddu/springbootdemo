package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zensar.dto.UserDto;
import com.zensar.entity.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto getUser(int id) {
		User user = userRepository.findById(id).get();
		 return modelMapper.map(user, UserDto.class);
		
	}

	@Override
	public List<UserDto> getAllusers() {
		List<User> users = userRepository.findAll();
		List<UserDto> listOfDtos = new ArrayList<>();
		for (User user : users) {
			listOfDtos.add(modelMapper.map(user, UserDto.class));

		}
		return listOfDtos;
		
	}

	@Override
	public UserDto CreateUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		User user1 = userRepository.save(user);
		return modelMapper.map(user1, UserDto.class);
	}

}
