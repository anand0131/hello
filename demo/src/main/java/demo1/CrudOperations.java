package demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudOperations {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperations.class, args);
	}

}