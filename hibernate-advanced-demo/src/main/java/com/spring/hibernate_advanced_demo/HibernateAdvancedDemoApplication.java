package com.spring.hibernate_advanced_demo;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.hibernate_advanced_demo.dao.AppDao;
import com.spring.hibernate_advanced_demo.entity.Course;
import com.spring.hibernate_advanced_demo.entity.Instructor;
import com.spring.hibernate_advanced_demo.entity.InstructorDetail;
import com.spring.hibernate_advanced_demo.entity.Review;
import com.spring.hibernate_advanced_demo.entity.Student;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateAdvancedDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateAdvancedDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AppDao app) {
		return runner -> {
			// createInstructor(app);
			// findInstructor(app);
			// deleteInstructor(app);
			// findInstructorDetail(app);
			// deleteInstructorDetail(app);
			// createInstructorWithCourses(app);
			// findInstructorWithCourses(app);
			// findCoursesForInstructor(app);
			// findInstructorWithCoursesJoinFetch(app);
			// updateInstructor(app);
			// deleteInstructorOnly(app);
			// createCourseAndReviews(app);
			// retrieveCourseAndReviews(app);
			// deleteCourseAndReviews(app);
			// createCourseAndStudents(app);
			// findCourseAndStudents(app);
			// findStudentAndCourses(app);
			// addMoreCoursesForStudent(app);
			deleteCourseById(app);
		};
	}

	private void deleteCourseById(AppDao app) {
		int id = 9;
		System.out.println("Delete course: " + id);

		app.deleteCourseById(id);
		System.out.println("Deleted successfully!");
	}

	// private void addMoreCoursesForStudent(AppDao app) {
	// 	int id = 2;
	// 	Student student = app.findStudentAndCoursesByStudentId(id);

	// 	Course course1 = new Course("How to Test without Running Application");
	// 	Course course2 = new Course("How to Develop without Computer");
	// 	Course course3 = new Course("How to Be a Legit Developer");

	// 	student.addCourse(course1);
	// 	student.addCourse(course2);
	// 	student.addCourse(course3);

	// 	System.out.println("Succesffuly enrolled to new courses!");

	// 	app.update(student);
	// }

	// private void findStudentAndCourses(AppDao app) {
	// 	int id = 2;
	// 	Student student = app.findStudentAndCoursesByStudentId(id);

	// 	System.out.println("Student: " + student);
	// 	System.out.println("Courses: " + student.getCourses());
	// }

	// private void findCourseAndStudents(AppDao app) {
	// 	int id = 6;
	// 	Course course = app.findCourseAndStudentByCourseId(id);

	// 	System.out.println("Course: " + course);
	// 	System.out.println("Students: " + course.getStudents());
	// }

	// private void createCourseAndStudents(AppDao app) {
	// 	// create a course
	// 	Course course = new Course("How to Be A FullStack Dev in Half A Day");

	// 	// create the students
	// 	Student student1 = new Student("Light", "Yagami", "light.yagami@example.com");
	// 	Student student2 = new Student("Leslie", "Andrews", "leslie.andrews@example.com");

	// 	// add student to the course
	// 	course.addStudent(student1);
	// 	course.addStudent(student2);

	// 	// save the course and associated students
	// 	app.save(course);
	// 	System.out.println("Successfully enrolled!");
	// }

	// private void deleteCourseAndReviews(AppDao app) {
	// 	int id = 2;
	// 	System.out.println("Delete course: " + id);

	// 	app.deleteCourseById(id);
	// 	System.out.println("Deleted successfully!");
	// }

	// private void retrieveCourseAndReviews(AppDao app) {
	// 	int id = 5;
	// 	System.out.println("Get course and reviews from id: " + id);
	// 	// get the course and reviews
	// 	Course course = app.findCourseAndReviewsByCourseId(id);

	// 	// print the course
	// 	System.out.println(course);

	// 	// print the reviews
	// 	System.out.println(course.getReview());
	// }
	
	// private void createCourseAndReviews(AppDao app) {
	// 	// create a course
	// 	Course course = new Course("How to Speed Run Spring in 1 Day");
	// 	// add some reviews
	// 	course.addReview(new Review("Great speed 2x...loved it!!!"));
	// 	course.addReview(new Review("I wanted the speed 0.75x :(("));
	// 	course.addReview(new Review("Hoping to do a speed of 3x :D. Anyways, nice!"));

	// 	// save the course
	// 	System.out.println("Course saved!");
	// 	app.save(course);
	// }

	// private void deleteInstructorOnly(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Delete Instructor: " + id);

	// 	app.deleteInstructorById(id);
	// 	System.out.println("Deleted successfully!");
	// }
	
	// private void updateInstructor(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Find instructor id: " + id);

	// 	Instructor ins = app.findInstructorById(id);

	// 	// change instructor's data
	// 	ins.setLastName("Cosma");

	// 	// update the data
	// 	System.out.println("Updated!");
	// 	app.update(ins);
	// }

	// private void findInstructorWithCoursesJoinFetch(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Find instructor id: " + id);

	// 	Instructor ins = app.findInstructorByIdJoinFetch(id);

	// 	System.out.println("Instructor: " + ins);
	// 	System.out.println("Courses: " + ins.getCourses());
	// }	

	// private void findCoursesForInstructor(AppDao app) {
	// 	int id = 1;

	// 	// find the instructor
	// 	System.out.println("Find instructor id: " + id);
	// 	Instructor ins = app.findInstructorById(id);

	// 	System.out.println("Instructor: " + ins);

	// 	// find courses for instructor
	// 	System.out.println("Courses for id: " + id);
	// 	List<Course> courses = app.findCoursesByInstructorId(id);

	// 	// associate the objects
	// 	ins.setCourses(courses);

	// 	// get the courses
	// 	System.out.println(ins.getCourses());
	// }

	// private void findInstructorWithCourses(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Find instructor id: " + id);

	// 	Instructor ins = app.findInstructorById(id);

	// 	System.out.println("Instructor: " + ins);
	// 	System.out.println("Courses: " + ins.getCourses());
	// }

	// private void createInstructorWithCourses(AppDao app) {
	// 	// create the instructor and details
	// 	Instructor ins = new Instructor("Peri", "Winkle", "peri.winkle@example.com");
	// 	InstructorDetail deets = new InstructorDetail("Science", "Sprinkling dust");

	// 	// associate the objects
	// 	ins.setInstructorDetail(deets);

	// 	// create courses
	// 	Course course1 = new Course("Physics");
	// 	Course course2 = new Course("Chemistry");

	// 	// add courses to instructor
	// 	ins.addCourse(course1);
	// 	ins.addCourse(course2);

	// 	// save the instructor
	// 	System.out.println("Courses saved: " + ins.getCourses());
	// 	app.save(ins);
	// }

	// private void deleteInstructorDetail(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Delete id: " + id);

	// 	app.deleteInstructorDetail(id);
	// 	System.out.println("Deleted successfully!");
	// }

	// private void findInstructorDetail(AppDao app) {
	// 	// find the instructor detail object
	// 	int id = 1;
	// 	InstructorDetail inDeets = app.findInstructorDetailById(id);

	// 	// print the instructor detail
	// 	System.out.println("Details: " + inDeets);

	// 	// print the associated instructor
	// 	System.out.println("Instructor: " + inDeets.getInstructor());
	// }

	// private void deleteInstructor(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Delete id: " + id);

	// 	app.deleteInstructorById(id);
	// 	System.out.println("Deleted successfully!");
	// }

	// private void findInstructor(AppDao app) {
	// 	int id = 1;
	// 	System.out.println("Find id: " + id);

	// 	Instructor ins = app.findInstructorById(id);

	// 	System.out.println("Instructor: " + ins);
	// 	System.out.println("Details: " + ins.getInstructorDeets());
	// }

	// private void createInstructor(AppDao app) {
	// 	// create the instructor and details
	// 	Instructor ins = new Instructor("Vicky", "Magtanggol", "vicky.mags@example.com");
	// 	InstructorDetail deets = new InstructorDetail("Math", "Solving problems");
		
	// 	// associate the objects
	// 	ins.setInstructorDetail(deets);

	// 	// save the instructor
	// 	// this will also save the details object
	// 	// because of CascadeType.ALL
	// 	System.out.println("Information saved!");
	// 	app.save(ins);
	// }
}
