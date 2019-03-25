package com.bits.squad.edurate.dao;


import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;

public interface UserDAO {

    void register(User user);

    User validateUser(Login login);

}
