package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;

public interface UserService {
    void register(User user);

    User validateUser(Login login);
}
