package com.mycompany.LearnJPA;

import com.mycompany.LearnJPA.Repo.Repository;
import com.mycompany.LearnJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnJpaApplication {

	public static void main(String[] args) {

		ApplicationContext appCon = SpringApplication.run(LearnJpaApplication.class, args);
		Repository rep = appCon.getBean(Repository.class);
		Student s1 = appCon.getBean(Student.class);
		s1.setName("Ansar");
		s1.setMarks(90);
		s1.setRollNo(20);

		Student s2 = appCon.getBean(Student.class);
		s1.setName("Saad");
		s1.setMarks(95);
		s1.setRollNo(22);

		rep.save(s2);
		rep.save(s1);

		Optional<Student> studentOpList = rep.findById(22);
		List<Student> studentList = rep.findAll();

		System.out.println(studentList+" "+studentList);


	}

}
