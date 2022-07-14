package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.UserDto;
import com.zensar.service.UserService;

@RestController
@RequestMapping(value = "/user-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user/{userId}")
	public ResponseEntity<UserDto> getUser(@PathVariable("userId") int id) {
		return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
	}

	@GetMapping("/users")
	public List<UserDto> getAllusers() {
		return userService.getAllusers();
	}

	@PostMapping("/user")
	public ResponseEntity<UserDto> CreateUser(@RequestBody UserDto userDto) {
		return new ResponseEntity<>(userService.CreateUser(userDto), HttpStatus.CREATED);
	}

}
