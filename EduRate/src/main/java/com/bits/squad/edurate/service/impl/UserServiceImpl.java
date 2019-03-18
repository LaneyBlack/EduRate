package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {

    }

    @Override
    public User validateUser(Login login) {
        return null;
    }
}
