package org.forten.sample.bo;

import org.forten.dto.Message;
import org.forten.sample.dao.BookDao;
import org.forten.sample.dao.MyBatisDao;
import org.forten.sample.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("bookBo")
public class BookBo {
    @Resource
    private MyBatisDao<BookDao> dao;

    @Transactional
    public Message doSave(Book book){
        int n = dao.getMapper(BookDao.class).save(book);
        if(n==1){
            return Message.info("保存成功");
        }
        return Message.error("保存失败");
    }

    @Transactional(readOnly = true)
    public Book queryById(int id){
        return dao.getMapper(BookDao.class).getById(id);
    }
}
