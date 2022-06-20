package com.example.demo;

import com.example.demo.UploadingFiles.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class }) //disable security spring
@EnableScheduling //habilita  ejecutor de tareas en segundo plano
@EnableConfigurationProperties(StorageProperties.class)
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

}
