package com.naver.sth.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //설정 파일입니다 객체 만들어주세요 라는 뜻을 가짐
public class FileMappingConfig implements WebMvcConfigurer {
	
	@Value("${app.upload.url}")
	private String  url;
	@Value("${app.upload.path}")
	private String base;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(url).addResourceLocations(base);	
		
		
		
	}
	
	
}
