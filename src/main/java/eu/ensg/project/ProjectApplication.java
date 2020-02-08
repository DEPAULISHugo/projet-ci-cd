package eu.ensg.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot application allowing user to get a product in a JSON file 
 * thanks to specific HTTP call
 * 
 * @author Hugo De Paulis
 *
 */
@SpringBootApplication
public class ProjectApplication {

	/**
	 * Main method that launch the application
	 * 
	 * @param args Unused
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
