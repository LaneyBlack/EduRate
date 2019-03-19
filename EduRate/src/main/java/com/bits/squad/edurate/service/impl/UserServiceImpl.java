package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.repository.UserRepository;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserByName(String userName) {
        return userRepository.findByName(userName);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
