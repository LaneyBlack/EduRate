package com.bits.squad.edurate.dao.impl;


import com.bits.squad.edurate.dao.UserDAO;
import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void register(User user) {

        String sql = "insert into users values(?,?,?)";

        jdbcTemplate.update(sql, new Object[] {
                user.getName(),
                user.getPassword(),
        });

    }

    @Override
    public User validateUser(Login login) {

        String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
                + "'";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users.size() > 0 ? users.get(0) : null;
    }
}

