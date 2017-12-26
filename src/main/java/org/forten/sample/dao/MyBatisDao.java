package org.forten.sample.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("mybatisDao")
public class MyBatisDao<T> {
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public T getMapper(Class<T> clazz){
        return sqlSessionFactory.openSession().getMapper(clazz);
    }
}
