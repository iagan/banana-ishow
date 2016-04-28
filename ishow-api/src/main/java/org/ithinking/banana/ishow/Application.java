package org.ithinking.banana.ishow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author agan
 * @since 2016-04-27
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana")
@MapperScan(basePackages = {"org.ithinking.banana.ishow.mapper"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
