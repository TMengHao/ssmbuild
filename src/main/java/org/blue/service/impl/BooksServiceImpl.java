package org.blue.service.impl;

import org.blue.entity.Books;
import org.blue.entity.mapper.BooksMapper;
import org.blue.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author blue
 * @date 2021/7/24
 */
@Service
public class BooksServiceImpl implements BooksService{

    @Autowired
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int insertBook(Books books) {
        return booksMapper.insertBook(books);
    }

    @Override
    public int deleteByBookId(int bookId) {
        return booksMapper.deleteByBookId(bookId);
    }

    @Override
    public int updateOneBook(Books books) {
        return booksMapper.updateOneBook(books);
    }

    @Override
    public Books selectOneBook(int bookId) {
        return booksMapper.selectOneBook(bookId);
    }

    @Override
    public List<Books> selectAllBook() {
        return booksMapper.selectAllBook();
    }

    @Override
    public List<Books> selectBookByName(String bookName) {
        return booksMapper.selectBookByName(bookName);
    }
}
