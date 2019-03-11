package com.bits.squad.edurate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

    public class HibernateUtil {

        private static final SessionFactory sessionFactory = buildFactory();

        private static SessionFactory buildFactory() {

            Configuration configuration = new Configuration();
            configuration.configure();

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            return sessionFactory;
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shoutdown() {
            getSessionFactory().close();
        }
}
