package gestionevenements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(new Object[]{Application.class, ServletContainerCustomizer.class}, args);
        SpringApplication.run(Application.class, args);
    }
}
