package com.bits.squad.edurate.dao;

import com.bits.squad.edurate.model.User;

import java.util.List;

public interface UserDAO {
    public void addUser(User user);
    public void updateUser(User user);
    public List<User> userList();
    public User getUserById(int id);
    public void removeUser(int id);
}
