package com.dentech.cruddemo;

import com.dentech.cruddemo.dao.AppDAO;
import com.dentech.cruddemo.entity.Instructor;
import com.dentech.cruddemo.entity.InstructorDetail;
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
	public CommandLineRunner commandLineRunner(AppDAO appDAO){

		return runner -> {
			//createInstructor(appDAO);
			//findInstructorById(appDAO);
			//deleteInstructorById(appDAO);
			//findInstructorDetailById(appDAO);
			deleteInstructorDetailById(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {

		/*
		// create instructor
		Instructor instructor =
				new Instructor("Nikola", "Nikolic", "nikola@gmail.com");

		// create instructor detail
		InstructorDetail instructorDetail =
				new InstructorDetail("http://www.youtube.com/channel", "DenTech");

		 */



		// create instructor
		Instructor instructor =
				new Instructor("Marko", "Markovic", "marko@gmail.com");

		// create instructor detail
		InstructorDetail instructorDetail =
				new InstructorDetail("http://www.youtube.com/channel", "CS");


		// associate the objects
		instructor.setInstructorDetail(instructorDetail);

		// save the instructor
		System.out.println("Saving instructor: " + instructor);
		appDAO.save(instructor);

		System.out.println("Done!");

	}

	private void findInstructorById(AppDAO appDAO){

		int id = 3;
		System.out.println("Finding instructor id: "+ id);

		Instructor instructor = appDAO.findInstructorById(id);

		if(instructor == null){
			System.out.println("Instructor by id: " + id + " was not found!");
		} else {
			System.out.println("Instructor found !!!");
			System.out.println(instructor);
		}
	}

	private void deleteInstructorById(AppDAO appDAO){

		int id = 3;
		System.out.println("Trying to find instructor by id: " + id);

		if(appDAO.findInstructorById(id) == null){
			System.out.println("Could not find instructor by id: " + id);
		} else{
			appDAO.deleteInstructorById(id);
			System.out.println("Instructor by id: " + id + " deleted successfully!!!");
		}
	}

	private void findInstructorDetailById(AppDAO appDAO) {

		// get the instructor detail object
		int id = 2;

		System.out.println("Looking for Instructor Detail by id: " + id);
		InstructorDetail instructorDetail = appDAO.findInstructorDetailsById(id);

		if(instructorDetail == null){
			System.out.println("Instructor Detail by id: " + id + " NOT FOUND.");
		} else{
			// print the instructor detail
			System.out.println("Instructor Detail found!!!");
			System.out.println(instructorDetail);

			// print the associated instructor
			System.out.println(instructorDetail.getInstructor());
		}
	}

	private void deleteInstructorDetailById(AppDAO appDAO) {

		int id = 3;
		System.out.println("Looking for Instructor Detail by id: " + id);
		InstructorDetail instructorDetail = appDAO.findInstructorDetailsById(id);

		if(instructorDetail == null){
			System.out.println("Could not found Instructor Detail by id: " + id);
		} else{
			appDAO.deleteInstructorDetailById(id);
			System.out.println("Instructor Detail deleted!!!");
		}
	}

}
