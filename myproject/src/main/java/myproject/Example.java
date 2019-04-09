package myproject;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
		System.out.println("system started!");
		SpringApplication app = new SpringApplication(Example.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
