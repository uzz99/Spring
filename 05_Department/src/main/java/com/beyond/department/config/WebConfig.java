package com.beyond.department.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring 서버 전역으로 CORS 설정
@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
//				.allowedOrigins("http://localhost:30080", "http://localhost:5173", "http://localhost")
				.allowedOriginPatterns("*")
				.allowedMethods("GET", "POST", "PUT", "DELETE");
	}
}
