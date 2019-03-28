package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.dao.UserDAO;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void setUserDao(UserDAO userDao) {
        this.userDAO = userDao;
    }

    @Override
    @Transactional
    public void addUser(User u) {
        this.userDAO.addUser(u);
    }

    @Override
    @Transactional
    public void updateUser(User u) {
        this.userDAO.updateUser(u);
    }

    @Override
    @Transactional
    public List<User> userList() {
        return this.userDAO.userList();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return this.userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.userDAO.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserByName(String name) {
        return this.userDAO.getUserByName(name);
    }


}
