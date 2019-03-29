package com.bits.squad.edurate.dao;


import com.bits.squad.edurate.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User u);
    void updateUser(User u);
    List<User> userList();
    User getUserById(int id);
    void removeUser(int id);
    User getUserByName(String name);
}
