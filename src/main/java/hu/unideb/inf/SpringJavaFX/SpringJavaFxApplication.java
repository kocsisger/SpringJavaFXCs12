package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import hu.unideb.inf.SpringJavaFX.model.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication implements CommandLineRunner {

	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);

		Person p = Person.builder()
				.name("Winch Eszter")
				.dateOfBirth(LocalDate.of(1999,11,05))
				.build();
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
