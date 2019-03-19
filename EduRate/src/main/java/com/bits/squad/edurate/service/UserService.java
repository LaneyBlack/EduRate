package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.User;

public interface UserService {
    public User findUserByName(String userName);

    public void saveUser(User user);
}
