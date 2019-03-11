package com.bits.squad.edurate.service;

import com.bits.squad.edurate.models.Login;
import com.bits.squad.edurate.models.User;

public interface UserService {
    void register(User user);

    User validateUser(Login login);

}
