package com.javarush.dao;

import com.javarush.domain.Country;
import org.hibernate.SessionFactory;

import java.util.List;

public class CountryDAO {

    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll(){
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Country", Country.class).list();
    }
}
