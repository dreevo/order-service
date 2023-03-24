package com.polarbookshop.orderservice.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    String isbn;
    String title;
    String author;
    Double price;

}
