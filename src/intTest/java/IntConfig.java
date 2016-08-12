import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cjemison on 8/12/16.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"example.controller.impl"})
public class IntConfig {
}
