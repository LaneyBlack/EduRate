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

    public User(Integer id, String userName, String password, String firstname) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstname = firstname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId", unique = true, nullable = false)
    private Integer id;

    @Column(name = "UserName", nullable = false, unique = true)
    private String userName;

    @Column(name = "UserFirstName", nullable = false)
    private String firstname;

    @Column(name = "UserPassword", nullable = false)
    private String password;

    @Column(name = "UserSubjects")
    private String userSubjects;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUserSubjects() {
        return userSubjects;
    }
    public void setUserSubjects(String userSubjects) {
        this.userSubjects = userSubjects;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
