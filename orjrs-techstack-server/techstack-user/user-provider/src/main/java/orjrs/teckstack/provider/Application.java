package orjrs.teckstack.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "orjrs.techstack.api.client")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
