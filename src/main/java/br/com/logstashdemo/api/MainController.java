package br.com.logstashdemo.api;

import br.com.logstashdemo.infra.log.AppLogger;
import com.google.gson.Gson;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/product")
    public ResponseEntity<String> getProduct(HttpServletRequest request) {


        Iterator<String> iterator = request.getHeaderNames().asIterator();

        String headerJson = "{ \"headers\" : {";
        while (iterator.hasNext()) {
            String header = iterator.next();
            headerJson = headerJson + "\"" + header + "\": \"" + request.getHeader(header) + "\",";
        }
        headerJson = headerJson.substring(0, headerJson.length() - 1) + "}}";
        AppLogger.info(headerJson);


        Gson gson = new Gson();

        AppLogger.info("getProduct", request);


        AppLogger.info("{\"Request\": {\"teste\": \"este é um texto fixo\" }}");

        AppLogger.info(request.getHeader("Content Type"));
        return ResponseEntity.ok("Hello World");
    }
}
