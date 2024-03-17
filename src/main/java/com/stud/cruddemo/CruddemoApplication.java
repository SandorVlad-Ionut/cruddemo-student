package com.stud.cruddemo;

import com.stud.cruddemo.dao.StudentDAO;
import com.stud.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner -> {

			//createStudent(StudentDAO);
			//createMultipleStudents(StudentDAO);
			//queryForStudents(studentDAO);
			//queryForLastName( studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);



		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int numDeleted=studentDAO.deleteAll();

	System.out.println("Rows deleted: "+ numDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=3;
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student myStudent=studentDAO.findById(studentId);
		myStudent.setFirstName("Paul");
		studentDAO.update(myStudent);
		System.out.println(myStudent.toString());
	}

	private void queryForLastName(StudentDAO studentDAO) {
		List <Student> theStudents=studentDAO.findByLastName("Covaci");
		for (Student tempStudent : theStudents){System.out.println(tempStudent);}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents= studentDAO.findAll();
		for (Student tempStudent : theStudents){System.out.println(tempStudent);}
	}



	private void createMultipleStudents(StudentDAO studentDAO) {

//		Student tempStudent1= new Student("Ana","Pop","ap@op.com");
//		studentDAO.save(tempStudent1);
//		Student tempStudent2= new Student("Bob","Smith","Bobby@Sth.com");
//		studentDAO.save(tempStudent2);
//		Student tempStudent3= new Student("Dan","Covaci","Covaci@dd.com");
//		studentDAO.save(tempStudent3);


	}


	private void createStudent(StudentDAO studentDAO)
	{
//		System.out.println("Creating new student object...");
//		Student tempStudent= new Student("Paul","Doe","Paul@Doe.com");
//		System.out.println("Saving the new student...");
//		studentDAO.save(tempStudent);
//		System.out.println("Saved student generated ID..."+ tempStudent.getId());

	}
}