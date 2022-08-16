package com.example.gateway;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
//import org.springframework.web.reactive.config.CorsRegistry;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.CorsRegistration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import java.util.Properties;
//import org.springframework.validation.Validator;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SuppressWarnings("deprecation")
@CrossOrigin(origins = "*")
@SpringBootApplication
@EnableEurekaClient
//@EnableWebSecurity
//@EnableWebFluxSecurity
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

//public class GatewayApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(GatewayApplication.class, args);
//	}
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
//						.allowedHeaders("*");
//			}
//		};
//	}
//	
//
//}

public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
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
