package com.love2code.cruddemo;

import com.love2code.cruddemo.dao.StudentDAO;
import com.love2code.cruddemo.entity.Student;
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
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);

//			findAllStudents(studentDAO);
//			findByLastName(studentDAO);

//			updateStudentLastName(studentDAO);

//			deleteOneStudent(studentDAO);
//			deleteByCondition(studentDAO);
//			deleteAll(studentDAO);

		};
	}

	private void deleteOneStudent(StudentDAO studentDAO){
		int studentId = 10;
		Student tempStudent = studentDAO.findById(studentId);

		studentDAO.deleteOneById(tempStudent.getId());
	}

	private void deleteByCondition(StudentDAO studentDAO){
		System.out.println("Deleting all students with last name 'Todorovic'");
		int rowsDeleted = studentDAO.deleteMultipleByCondition("Todorovic");
		System.out.println("Total rows deleted: " + rowsDeleted);

	}

	private void deleteAll(StudentDAO studentDAO){
		System.out.println("Deleting all students. . . ");
		int rowsDeleted = studentDAO.deleteAll();
		System.out.println("Total rows deleted: " + rowsDeleted);
	}

	private void updateStudentLastName(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Student id: " + studentId);

		System.out.println("Finding student by id . . .");
		Student tempStudent = studentDAO.findById(studentId);
		System.out.println(tempStudent);

		tempStudent.setLastName("Tester");
		studentDAO.updateLastName(tempStudent);
		System.out.println("Updating Student last name . . .");

		System.out.println(tempStudent);

	}

	private void findByLastName(StudentDAO studentDAO){
		// get a list of students

		List<Student> theStudents = studentDAO.findByLastName("Todorovic");

		for (Student tempStudent :
				theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void findAllStudents(StudentDAO studentDAO) {
		System.out.println();
		System.out.println("Printing all students . . .");
		List<Student> listOfStudents = studentDAO.findAll();

		for (Student tempStudent :
				listOfStudents) {
			System.out.println(tempStudent);
		}
		System.out.println();
	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Creating new student object . . .");
		Student tempStudent = new Student("Marko", "Todorovic", "trisacar94@gmail.com");

		//save the student
		System.out.println("Saving the student . . .");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated ID: " + theId);

		//retrieve student based on the id: primary key
		System.out.println("Retreiving a student with ID: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating students . . .");
		Student student1 = new Student("Nikola", "Prvulovic", "nikolaprvulovic@gmail.com");
		Student student2 = new Student("Marko", "Todorovic", "markocar94@gmail.com");
		Student student3 = new Student("Darko", "Stamenkovic", "stamenkovicdarko85@gmail.com");

		System.out.println("Saving students . . .");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}


	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object . . .");
		Student tempStudent = new Student("Marko", "Todorovic", "trisacar94@gmail.com");

		// save the student object
		System.out.println("Saving the student . . .");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
		System.out.println(tempStudent);
	}
}
