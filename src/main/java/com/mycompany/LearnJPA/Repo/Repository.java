package com.mycompany.LearnJPA.Repo;

import com.mycompany.LearnJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Integer> {

  Student findByMarksGreaterThan(int marks);
    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.marks = :marks")
    void deleteByMarks(int marks);


}
