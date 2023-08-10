package springboot.sandbox.models;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("main")
public class MainTest {

    public MainTest() {
        log.info("Main Class");
    }
}
