package com.example.devops_integration;

import jakarta.servlet.ServletOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
@SpringBootApplication
public class DevopsIntegrationApplication {

	@GetMapping
	public String getMessage()
	{
		return "welcome to devops-integration Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}


}
