package com.newcoder.community.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AplhaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
