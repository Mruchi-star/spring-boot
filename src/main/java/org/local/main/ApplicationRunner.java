package org.local.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
 
@SpringBootApplication(scanBasePackages="org.local.*")
//@ComponentScan("org.local.*")
public class ApplicationRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationRunner.class, args);
	}

}
