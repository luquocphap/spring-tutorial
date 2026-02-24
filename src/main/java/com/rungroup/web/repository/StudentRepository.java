package com.rungroup.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rungroup.web.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    Optional<Student> findById(Long id);
}
