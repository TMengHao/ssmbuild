package org.blue.entity.mapper;

import org.apache.ibatis.annotations.Param;
import org.blue.entity.Books;

import java.util.List;

/**
* @Entity org.blue.entity.Books
*/
public interface BooksMapper{
    //增加一本书
    int insertBook(Books books);

    //删除一本书
    int deleteByBookId(@Param("bookId")int bookId);

    //更新一本书
    int updateOneBook(Books books);

    //查询一本书
    Books selectOneBook(@Param("bookId")int bookId);

    //查询全部的书
    List<Books> selectAllBook();

    //显示查询书籍根据名字
    List<Books> selectBookByName(@Param("bookName") String bookName);
}
