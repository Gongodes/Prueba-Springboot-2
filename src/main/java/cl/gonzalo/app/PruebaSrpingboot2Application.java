package cl.gonzalo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class PruebaSrpingboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSrpingboot2Application.class, args);
	}

}
