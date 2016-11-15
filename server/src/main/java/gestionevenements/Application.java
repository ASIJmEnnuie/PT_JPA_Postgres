package gestionevenements;

import gestionevenements.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(new Object[]{Application.class, ServletContainerCustomizer.class}, args);
        SpringApplication.run(Application.class, args);
    }
}
