package springboot.sandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootSandboxApplication {

    public static void main(String[] args) {
      //  System.setProperty("spring.config.name", "bankapp");
        SpringApplication.run(SpringBootSandboxApplication.class, args);

        //Logger log = LoggerFactory.getLogger(SpringBootSandboxApplication.class);
        log.debug("This is a test debug message");
        log.info("This is a test info message");
        log.warn("This is a test warn message");
        log.error("This is a test error message");

    }


}
