package com.books.test.services;

import com.books.test.entities.Book;
import com.books.test.models.BookModel;
import com.books.test.repos.BookDAO;
import com.books.test.services.interfaces.BookService;
import com.books.test.utils.Response;
import com.books.test.utils.ResponseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Object getAllBooks() {
        List<Book> books = bookDAO.findAll();
        List<BookModel> bookModels = null;
        if(!books.isEmpty()){
            bookModels = books.stream().map(BookModel::new).toList();
        }
        return new ResponseData<>(Response.SUCCESS.status(),bookModels);
    }
}
