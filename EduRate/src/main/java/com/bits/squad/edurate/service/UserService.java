package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void register(User user);

    User validateUser(Login login);

}
