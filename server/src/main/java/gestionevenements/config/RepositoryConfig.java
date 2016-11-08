package gestionevenements.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "gestionevenements.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"gestionevenements.domain"})
public class RepositoryConfig {
}
