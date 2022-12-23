package com.Book.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Book.Models.BookEntity;

@Repository
public interface IBookRepo extends JpaRepository<BookEntity, Integer> {

}
