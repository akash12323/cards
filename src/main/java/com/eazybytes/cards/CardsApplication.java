package com.eazybytes.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
/*
 * @EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
 * 
 * @OpenAPIDefinition( info = @Info( title =
 * "Cards microservice REST API Documentation", description =
 * "EazyBank Cards microservice REST API Documentation", version = "v1", contact
 * = @Contact( name = "Madan Reddy", email = "tutor@eazybytes.com", url =
 * "https://www.eazybytes.com" ), license = @License( name = "Apache 2.0", url =
 * "https://www.eazybytes.com" ) ), externalDocs = @ExternalDocumentation(
 * description = "EazyBank Cards microservice REST API Documentation", url =
 * "https://www.eazybytes.com/swagger-ui.html" ) )
 */
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
