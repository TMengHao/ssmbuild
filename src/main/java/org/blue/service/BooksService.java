package org.blue.service;

import org.blue.entity.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public interface BooksService{

    //增加一本书
    int insertBook(Books books);

    //删除一本书
    int deleteByBookId(int bookId);

    //更新一本书
    int updateOneBook(Books books);

    //查询一本书
    Books selectOneBook(int bookId);

    //查询全部的书
    List<Books> selectAllBook();

    List<Books> selectBookByName(String bookName);

}
