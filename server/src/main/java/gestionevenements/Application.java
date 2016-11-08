package gestionevenements;

import gestionevenements.config.*;
import gestionevenements.server.ServletContainerCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{WebSocketConfig.class, ServletContainerCustomizer.class}, args);
    }
}
