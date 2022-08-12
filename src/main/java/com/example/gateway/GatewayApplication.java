package com.example.gateway;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import java.util.Properties;

@CrossOrigin
@SpringBootApplication
@EnableEurekaClient
//@Configuration
//@SuppressWarnings("deprecation")

//public class GatewayApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(GatewayApplication.class, args);
//	}
//	
//
//}

public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
						.allowedHeaders("*");
			}
		};
	}

}

//public class GatewayApplication extends SpringBootServletInitializer {
//
//	@Autowired
//	private Properties env;
//
//	public static void main(String[] args) {
//		SpringApplication.run(GatewayApplication.class, args);
//	}
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@SuppressWarnings("unused")
//			public void addCorsMappings(CorsRegistry registry) {
//				String urls = env.getProperty("cors.urls");
//				
//				org.springframework.web.reactive.config.CorsRegistration reg = registry.addMapping("/api/**");
//				for (String url : urls.split(",")) {
//					reg.allowedOrigins(url);
//				}
//			}
//		};
//	}
//
//}
