package com.farmerscheme.farmerscheme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;*/

@SpringBootApplication
/*@ComponentScan(basePackages = "com.farmerscheme.farmerscheme.dao")
@EntityScan("com.farmerscheme.farmerscheme.entities")
@EnableJpaRepositories(basePackages = "com.farmerscheme.farmerscheme.dao")*/
public class FarmerschemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerschemeApplication.class, args);
	}

}
     