package br.com.logstashdemo.infra.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public final class AppLogger {
    private static final Logger logger = LoggerFactory.getLogger(AppLogger.class);
    private AppLogger() {}
    public static void info(String message, Object... args) {
        logger.info(message, args);
    }

    public static void warn(String message, Object... args) {
        logger.warn(message, args);
    }

    public static void error(String message, Object... args) {
        logger.error(message, args);
    }

    public static void debug(String message, Object... args) {
        logger.debug(message, args);
    }
}
