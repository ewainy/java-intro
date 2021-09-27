package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //makes the bean work

public class AppConfig {

	
	// example from QA
	  @Bean
	    public String greeting() {
	        return "Hello, World";
	    }

	  @Bean
	  public LocalTime localTime() {
		  return LocalTime.now();
	  }
	  
}


//When beans are created they are saved to an instance of ApplicationContext; you can access this instance from the main() method of any Spring project:

package com.example.demo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		   ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
	
	
	//example from QA
		  Object byName = context.getBean("greeting");
		    String byType = context.getBean(String.class);
		    String byBoth = context.getBean("greeting", String.class);

		    System.out.println(byName);
		    System.out.println(byType);
		    System.out.println(byBoth);
	
	
	
		    Object byName1 = context.getBean("localTime");
		   LocalTime byType1 = context.getBean(LocalTime.class);
		   LocalTime byBoth1 = context.getBean("localTime", LocalTime.class);

		    System.out.println(byName1);
		    System.out.println(byType1);
		    System.out.println(byBoth1);
	
	
	
	
	}

}
