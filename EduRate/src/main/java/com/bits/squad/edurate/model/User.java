package com.bits.squad.edurate.model;

import javax.persistence.*;

@Entity
@Table(name = "user", catalog = "edurate",
        uniqueConstraints = {@UniqueConstraint(columnNames = "UserId"),
                             @UniqueConstraint(columnNames = "UserName")
                            })
public class User {

    public User() {
    }

    public User(Integer id, String name, String password, String firstName) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId", unique = true, nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
