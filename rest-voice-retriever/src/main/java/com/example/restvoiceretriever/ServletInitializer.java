package com.example.restvoiceretriever;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestVoiceRetrieverApplication.class);
	}




    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(
          WarInitializerApplication.class);
        sa.run(args);
    }

    @RestController
    public static class WarInitializerController {

        @GetMapping("/")
        public String handler() {
           return "Hello"
        }
    }

}
