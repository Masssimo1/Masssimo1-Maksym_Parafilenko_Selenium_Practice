package ua.tests.loggers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerWithLombokTest {
    public static void main(String[] args) {
        String myParameter = "PARAMETER";
        log.info("Info log with lombok {}", myParameter);
        log.warn("Warn log with lombok {}, {}", myParameter, myParameter);
        log.error("Error log with lombok");
        log.debug("Debug log with lombok");
    }
}
