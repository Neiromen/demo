package AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("AOP")
@EnableAspectJAutoProxy
@PropertySource("application.properties")
public class MyConfig {
}
