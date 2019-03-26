package com.bits.squad.edurate.model;

import javax.persistence.*;

@Entity
@Table(name = "user", catalog = "edurate",
        uniqueConstraints = {@UniqueConstraint(columnNames = "UserName"),
                @UniqueConstraint(columnNames = "UserPassword")})
public class User {

    @Column(name = "UserName", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "UserPassword", nullable = false)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "UserFirstName", nullable = false)
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User(String name, String password, String firstName) {
        this.name = name;
        this.password = password;
        this.firstName = firstName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
