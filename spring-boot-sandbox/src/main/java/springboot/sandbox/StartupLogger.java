package springboot.sandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StartupLogger {

   // private static final Logger log = LoggerFactory.getLogger(StartupLogger.class);

    StartupLogger(@Value("${helloMessage}") String helloMessage) {
        log.info("-----> Current profile is: {}", helloMessage);
    }


}
