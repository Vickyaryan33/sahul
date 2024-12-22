package com.sahul.repository;

import com.sahul.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
  Optional<Student> findByEmail(Integer integer);
  Optional<Student> findByName(String name);
}