package com.exam.transfers;

import org.springframework.stereotype.Component;

import com.exam.dto.UserDTO;
import com.exam.model.User;

@Component
public class UserDTOToEntity {
	public User convertUserDTOToEntity(UserDTO userDto, User user) {
		user.setPassword(userDto.getPassword());
		user.setuFirstName(userDto.getUserFirstName());
		user.setuLastName(userDto.getUserLastName());
		
		return user;
	}
}