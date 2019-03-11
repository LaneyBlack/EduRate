package com.bits.squad.edurate;

import com.bits.squad.edurate.models.User;
import com.bits.squad.edurate.util.HibernateUtil;
import org.hibernate.*;

public class ClientCode1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        User user = new User("Anton001", "123456");

        session.save(user);
        session.getTransaction().commit();
    }
}
