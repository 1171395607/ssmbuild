package com.zzh.service;

import com.zzh.pojo.Books;

import java.util.List;

/**
 * @author zzh
 * @create 2020
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //修改一本书
    int updateBook(Books books);

    //查找一本书
    Books queryBookById(int id);

    //查找全部本书
    List<Books> queryAllBook();

    //根据名字模糊查找书籍
    List<Books> queryBookByName(String bookName);
}
