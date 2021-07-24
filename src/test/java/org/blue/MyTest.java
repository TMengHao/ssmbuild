package org.blue;

import org.blue.entity.Books;
import org.blue.service.BooksService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Blue
 * @date 2021/7/24
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = (BooksService)context.getBean("booksServiceImpl");
        for (Books books : booksServiceImpl.selectAllBook()) {
            System.out.println(books);
        }
    }
}
