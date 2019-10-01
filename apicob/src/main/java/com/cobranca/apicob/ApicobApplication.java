package com.cobranca.apicob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("com.cobranca.apicob.models")
@SpringBootApplication
public class ApicobApplication {
	 
	public static void main(String[] args) {
		SpringApplication.run(ApicobApplication.class, args);
	}

}
