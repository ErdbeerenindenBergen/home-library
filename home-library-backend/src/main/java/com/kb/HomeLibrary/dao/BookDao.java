package com.kb.HomeLibrary.dao;

import com.kb.HomeLibrary.model.Book;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;

public interface BookDao {

    public Book getBookFromDatabase(String ISBN);

    public List<Book> findAll();

    public Book mapRowToBook(SqlRowSet rowSet);

    List<Book> getBooksByTitle(String title);

    public void createBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(String ISBN);

}