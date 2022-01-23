package by.anton.getserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GetServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetServerApplication.class, args);
    }

}
