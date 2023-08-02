package config;

import models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigTransport {

Transport transport;
    @Bean(name = "transport1")
    public Transport transport1() {
        return new Car("Mazda");
    }

    @Bean(name = "transport2")
    public Transport transport2() {
        return new Bus("Solaris");
    }

    @Bean(name = "transport3")
    public Transport transport3() {
        return new Pickup("Dodge");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася", transport);
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя", transport);
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Ваня", transport);

    }


}
