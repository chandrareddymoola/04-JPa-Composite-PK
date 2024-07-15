package com.chandra;

import com.chandra.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	ConfigurableApplicationContext cntxt= SpringApplication.run(Application.class, args);
   PersonService personService= cntxt.getBean(PersonService.class);
   //personService.savePerson();
   personService.getperson();
	}

}
