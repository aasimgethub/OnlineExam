package com.exam.service;

import java.util.List;


import com.exam.dto.UserDTO;
import com.exam.model.Login;
import com.exam.model.User;

public interface UserService {

	public Boolean userRegister(User user);

	public User validateUser(Login login);

	public User getUserDetailsById(String userId);



	public List<User> getAllUser();

	public void deleteUser(String userName);

	public UserDTO updateUser(String userId, UserDTO userDTO);

	public User updateUser(User user);

}

