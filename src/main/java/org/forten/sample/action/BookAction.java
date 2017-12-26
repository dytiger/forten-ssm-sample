package org.forten.sample.action;

import org.forten.dto.Message;
import org.forten.sample.bo.BookBo;
import org.forten.sample.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BookAction {
    @Resource
    private BookBo bo;

    @RequestMapping("/book/save")
    public @ResponseBody
    Message save(@RequestBody Book book){
        return bo.doSave(book);
    }
}
