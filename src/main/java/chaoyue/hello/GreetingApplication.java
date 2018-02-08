package chaoyue.hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@MapperScan("chaoyue.hello.mapper")
public class GreetingApplication {
  public static void main(String[] args) {
    SpringApplication.run(GreetingApplication.class, args);
  }
}
