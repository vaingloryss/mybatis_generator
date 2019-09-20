package com.vainglory.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlSessionUtils {

    private static SqlSessionFactory sessionFactory;
    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(){
        return sessionFactory.openSession();
    }
}
