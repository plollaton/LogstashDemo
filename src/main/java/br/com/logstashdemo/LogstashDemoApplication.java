package br.com.logstashdemo;

import br.com.logstashdemo.infra.log.AppLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogstashDemoApplication {

    public static void main(String[] args) {

        AppLogger.info("entrou");
        SpringApplication.run(LogstashDemoApplication.class, args);
    }

}
