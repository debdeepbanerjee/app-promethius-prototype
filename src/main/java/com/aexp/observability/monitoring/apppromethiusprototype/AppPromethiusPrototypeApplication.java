package com.aexp.observability.monitoring.apppromethiusprototype;

import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppPromethiusPrototypeApplication {
  static final Logger logger = LoggerFactory.getLogger(AppPromethiusPrototypeApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AppPromethiusPrototypeApplication.class, args);
  }

  @GetMapping("/check")
  public String createLogs() {
    logger.warn("Just checking");
    return "All Ok";
  }

  @Bean
  public Function<String, String> reverseString() {
    return value -> new StringBuilder(value).reverse().toString();
  }
}
