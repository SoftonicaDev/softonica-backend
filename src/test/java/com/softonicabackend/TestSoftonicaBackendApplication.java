package com.softonicabackend;

import org.springframework.boot.SpringApplication;

public class TestSoftonicaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(SoftonicaBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
