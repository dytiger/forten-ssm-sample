package org.forten.sample.bo;

import org.forten.BaseTest;
import org.forten.dto.Message;
import org.forten.sample.model.Book;
import org.forten.util.DateUtil;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class BookBoTest extends BaseTest{
    @Resource(name="bookBo")
    private BookBo bo;

    @Test
    public void testDoSave(){
        Book book = new Book("Python Beginning","Tom",38,"中国人民出版社", DateUtil.getDate(2017,12,10));
        Message msg = bo.doSave(book);
        assertEquals("info",msg.getTypeDes());
        System.out.println(book);
    }

    @Test
    public void testQueryById(){
        Book b1 = bo.queryById(1);
        Book b2 = bo.queryById(2);
        assertNotNull(b1);
        assertNotNull(b2);
        assertEquals(128,b1.getPrice());
        assertEquals(38,b2.getPrice());

        System.out.println(b1);
        System.out.println(b2);
    }
}