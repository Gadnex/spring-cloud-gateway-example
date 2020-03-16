package net.binarypaper.hello.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "${application.name}",
                description = "${application.description}",
                version = "${application.version}",
                contact = @Contact(
                        name = "William Gadney",
                        email = "gadnex@gmail.com"
                ),
                license = @License(
                        name = "APACHE LICENSE, VERSION 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        servers = {
            @Server(description = "gateway-service", url = "http://localhost:8080/")
        }
)
public class SpringdocConfiguration {

}
