package org.forten.sample.dao;

import org.apache.ibatis.annotations.*;
import org.forten.sample.model.Book;

public interface BookDao {
    @Results(id="bookMap",value={
        @Result(property = "pubDate",column = "pub_date")
    })
    @Insert("INSERT INTO test_book (name,author,press,price,pub_date) " +
            "VALUES (#{name},#{author},#{press},#{price},#{pubDate})")
    int save(Book book);

    @Results(id="bookMap2",value={
            @Result(property = "pubDate",column = "pub_date")
    })
    @Select("SELECT id,name,author,price,press,pub_date " +
            "FROM test_book " +
            "WHERE id=#{id}")
    Book getById(int id);
}
