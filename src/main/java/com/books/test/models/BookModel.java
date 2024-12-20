package com.books.test.models;

import com.books.test.entities.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookModel {
    private Integer id;
    private String title;
    private String description;
    private String author;

    public BookModel(Book book){
        this.id = book.getId();
        this.title = book.getTitle();
        this.description = book.getDescription();
        author = book.getAuthor();
    }
}
