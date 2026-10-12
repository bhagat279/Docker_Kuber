package com.docker_kuberemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/docker-kuber")
public class DockerKuberemoApplication {

	@GetMapping("/get")
	public String get()
	{
		return "docker-kuber";
	};

	public static void main(String[] args) {
		SpringApplication.run(DockerKuberemoApplication.class, args);
		System.out.println("started");
	}

}
