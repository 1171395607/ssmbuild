package com.zzh.dao;

import com.zzh.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zzh
 * @create 2020
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //修改一本书
    int updateBook(Books books);

    //查找一本书
    Books queryBookById(@Param("bookID") int id);

    //查找全部本书
    List<Books> queryAllBook();

    //根据名字模糊查询书籍
    List<Books> queryBookByName(@Param("bookName") String bookName);

}
