package com.example.NgoHoangKietQLSach.repository;

import com.example.NgoHoangKietQLSach.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}