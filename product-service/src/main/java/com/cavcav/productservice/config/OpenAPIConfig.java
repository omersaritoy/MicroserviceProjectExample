package com.cavcav.productservice.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI productServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Product Service API").description("This is the product service API.").version("1.0")
                        .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation().description("You can refer to the product service wiki documentation")
                        .url("https://product-service-dummy-url.com/docs"));


    }
}
