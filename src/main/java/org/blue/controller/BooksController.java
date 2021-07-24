package org.blue.controller;

import org.blue.entity.Books;
import org.blue.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @author Blue
 * @date 2021/7/24
 */
@Controller
@RequestMapping("/books")
public class BooksController {
    @Autowired
    @Qualifier("booksServiceImpl")
    private BooksService booksService;

    //查询一个书籍，返回书籍页面
    @RequestMapping("/")
    public String selList(Model model){
        List<Books> books = booksService.selectAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBookPage";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook:"+books);
        booksService.insertBook(books);
        return "redirect:/books/";
    }

    //跳转到修改书籍页
    @RequestMapping(value ="/toUpdatePage")
    public String toUpdatePage(int bookId,Model model){
        Books books = booksService.selectOneBook(bookId);
        model.addAttribute("SELBook",books);
        return "updatePage";
    }

    //修改书籍的请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook:"+books);
        booksService.updateOneBook(books);
        return "redirect:/books/";
    }

    //删除一本书
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int bookId){
        System.out.println("deleteBook:"+bookId);
        booksService.deleteByBookId(bookId);
        return "redirect:/books/";
    }

    //查询书籍
    @RequestMapping("/selectBook")
    public String selectBook(String selectBookInfo, Model model){
        List<Books> booksList = booksService.selectBookByName(selectBookInfo);
        if(booksList.size() == 0){
            model.addAttribute("error","查询错误！");
        }else{
            model.addAttribute("list",booksList);
        }
        return "allBook";
    }

    //查询所有书籍
    @RequestMapping("/selectAllBook")
    public String selectAllBook(){
        return "redirect:/books/";
    }
}
