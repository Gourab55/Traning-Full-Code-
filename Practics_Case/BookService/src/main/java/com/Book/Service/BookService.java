package com.Book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Models.BookEntity;

@Service
public class BookService {
	
	@Autowired
	IBookRepo ibookRepo;
	
	
	public Integer saveBook(BookEntity book) {
		BookEntity bk= ibookRepo.save(book);
		return bk.getId();
	}
	
	
	public Optional<BookEntity> GetBookByid(int id){
		return ibookRepo.findById(id);
		
	}
	
	public List<BookEntity> getallBooks(){
		
		return ibookRepo.findAll();
	}
	
	

}
