package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ARepository aRepository, BRepository bRepository, CRepository cRepository, DRepository dRepository) {
		return (args) -> {

			var a = A.builder().text("a instance").build();
			aRepository.save(a);
			var b = B.builder().text("b instance").build();
			bRepository.save(b);

			a.setBs(Set.of(b));
			aRepository.save(a);

			var c = C.builder().text("c instance").build();
			cRepository.save(c);
			var d = D.builder().text("d instance").build();
			dRepository.save(d);

			c.setDs(List.of(d));
			cRepository.save(c);

		};
	}

}
