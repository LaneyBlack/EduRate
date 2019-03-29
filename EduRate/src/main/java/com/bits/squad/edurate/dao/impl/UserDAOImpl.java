package com.bits.squad.edurate.dao.impl;


import com.bits.squad.edurate.dao.UserDAO;
import com.bits.squad.edurate.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
    }

    @Override
    public void updateUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(u);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> userList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from user").list();
        return userList;
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User u = (User) session.load(User.class, new Integer(id));
        return u;
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User u = (User) session.load(User.class, new Integer(id));
        if(u != null){
            session.delete(u);
        }
    }

    @Override
    public User getUserByName(String name) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("UserName", name));
        User user = (User) criteria.uniqueResult();
        return user;
    }
}

