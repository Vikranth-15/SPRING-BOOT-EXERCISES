package com.example.goodreadsorm.repository;

import com.example.goodreadsorm.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookJpaRepository extends JpaRepository<Book,Integer> {

}
