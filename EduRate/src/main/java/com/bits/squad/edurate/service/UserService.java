package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;

public interface UserService {

    User validateUser(Login login);

    void register(User user);

}
