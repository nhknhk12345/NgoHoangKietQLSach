package com.example.NgoHoangKietQLSach.repository;

import com.example.NgoHoangKietQLSach.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
