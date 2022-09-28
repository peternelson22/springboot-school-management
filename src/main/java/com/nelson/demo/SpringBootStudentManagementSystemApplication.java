package com.nelson.demo;

import com.nelson.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	/*@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Sandra","Ehi","sandra@gmail.com","Ghana", LocalDate.of(1999,02, 22));
		studentRepository.save(student);
		Student student2 = new Student("Olowo","Pelumi","olowo@gmail.com","Chile", LocalDate.of(1990,02, 22));
		studentRepository.save(student2);
	}
*/
}
