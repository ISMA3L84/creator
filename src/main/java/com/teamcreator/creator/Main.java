package com.teamcreator.creator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
@ComponentScan(basePackages =  {"com.teamcreator.creator"})
@EntityScan("com.teamcreator.creator.Modelo")
@EnableJpaRepositories(basePackages =  {"com.teamcreator.creator.Repositorios"})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**")
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedOrigins("*")
					.allowedHeaders("*");
			}
		};
	}

}
