package com.zensar.service;

import java.util.List;

import com.zensar.dto.UserDto;

public interface UserService {
	
	public UserDto getUser(int id);
	
	public List<UserDto> getAllusers();
	
	public UserDto CreateUser(UserDto userDto);
	

}
