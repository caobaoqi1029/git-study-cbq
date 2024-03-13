package jzxy.cbq.sb3demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Sb3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3DemoApplication.class, args);

        log.info("Sb3DemoApplication started successfully.");
    }

}
