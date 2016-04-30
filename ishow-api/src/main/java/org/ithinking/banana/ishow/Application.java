package org.ithinking.banana.ishow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @author agan
 * @since 2016-04-27
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana")
//@MapperScan(basePackages = {"org.ithinking.banana.ishow.mapper"})
@EnableAutoConfiguration
public class Application {


    /**
     * WebApplicationInitializer
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /**
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
       **/
    }
}
