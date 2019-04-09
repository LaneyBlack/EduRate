package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User u);
    public void updateUser(User u);
    public List<User> userList();
    public User getUserById(int id);
    public void removeUser(int id);
    public User getUserByName(String name);

}
