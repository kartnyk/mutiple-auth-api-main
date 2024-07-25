package com.anita.multipleauthapi;

import com.anita.multipleauthapi.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableConfigurationProperties(AppProperties.class)
public class MultipleAuthApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleAuthApiApplication.class, args);
    }

}
