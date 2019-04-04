package com.bits.squad.edurate.dao.impl;

import com.bits.squad.edurate.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int arg1) throws SQLException {
        User user = new User();
        user.setName(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setFirstname(rs.getString("firstname"));
        return user;
    }
}
