package by.anton.getcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GetControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetControllerApplication.class, args);
    }

}
