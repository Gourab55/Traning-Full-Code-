package com.Book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Book.Models.BookEntity;
import com.Book.Service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/savebook")
	Integer createBook(@RequestBody BookEntity book) {
		
		Integer id=bookService.saveBook(book);
		System.out.println(id);
		return id;
		
	}
	
	

}
