package com.demo.aws.users.service;

import com.demo.aws.users.entity.User;
import com.demo.aws.users.model.UserDto;
import com.demo.aws.users.repo.UserRepository;

import java.time.ZonedDateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sravantatikonda
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public UserDto registerUser(final UserDto userRequest) throws Exception {
    User user = new User();
    BeanUtils.copyProperties(userRequest, user);

    user.setCreatedAt(ZonedDateTime.now());
    user.setUpdatedAt(ZonedDateTime.now());

    BeanUtils.copyProperties(userRepository.save(user), userRequest);
    return userRequest;
  }

  public UserDto updateUser(final UserDto userRequest) throws Exception {
    User user = userRepository.getById(userRequest.getUserId());
    BeanUtils.copyProperties(userRequest, user);
    user.setUpdatedAt(ZonedDateTime.now());
    BeanUtils.copyProperties(userRepository.save(user), userRequest);
    return userRequest;
  }

  public UserDto getUser(final Integer userId) throws Exception {
    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(userRepository.getById(userId), userDto);
    return userDto;
  }


}
