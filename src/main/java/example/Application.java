package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@PropertySource(ignoreResourceNotFound = true, value = {
      "classpath:gol-${spring.profiles.active}.properties"})
public class Application extends SpringBootServletInitializer {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);

  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return super.configure(builder);
  }
}