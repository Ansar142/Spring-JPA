package com.mycompany.LearnJPA.Repo;

import com.mycompany.LearnJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Integer> {

}
