package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.repository.UserRepository;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(Login login) {
        return null;
    }

    @Override
    public void register(User user) {

    }
}
