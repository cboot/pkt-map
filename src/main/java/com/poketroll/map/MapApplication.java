package com.poketroll.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.poketroll.map")
public class MapApplication {

  public static void main(String[] args) {
    SpringApplication.run(MapApplication.class, args);
  }
}
