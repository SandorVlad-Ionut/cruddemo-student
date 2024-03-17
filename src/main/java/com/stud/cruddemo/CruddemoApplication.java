package com.stud.cruddemo;

import com.stud.cruddemo.dao.StudentDAO;
import com.stud.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO StudentDAO)
	{
		return runner -> {

			createStudent(StudentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO)
	{
		System.out.println("Creating new student object...");
		Student tempStudent= new Student("Paul","Doe","Paul@Doe.com");
		System.out.println("Saving the new student...");
		studentDAO.save(tempStudent);
		System.out.println("Saved student generated ID..."+ tempStudent.getId());

	}
}