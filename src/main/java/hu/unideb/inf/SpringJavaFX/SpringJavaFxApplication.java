package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);

		/*Person p = new Person();
		p.setId(10);
		p.setName("Robert");
		p.setDateOfBirth(LocalDate.of(1998,12,15));
		Person p2 = new Person(1,"tom", LocalDate.of(1999,11,11));*/

		Person p = Person.builder()
				.name("Winch Eszter")
				.dateOfBirth(LocalDate.of(1999,11,05))
				.build();
	}

}
