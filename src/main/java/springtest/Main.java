package springtest;

import java.util.Collections;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springtest.config.WebMVCConfig;

@SpringBootApplication
public class Main {
	
	public static void main(String[] args) {
		Main.initialize(args);
	}

	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMVCConfig();
	}
	
	@Bean
	public ServletContextInitializer servletContextInitializer() {
		return new ServletContextInitializer() {
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
				SessionCookieConfig sessionCookieConfig = servletContext.getSessionCookieConfig();
				sessionCookieConfig.setHttpOnly(true);
			}
		};
	}
	
	public static ConfigurableApplicationContext initialize(String[] args) {
		System.setProperty("server.port", "8080");
		return SpringApplication.run(Main.class);
	}
}
