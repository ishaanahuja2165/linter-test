package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
public class DemoApplication {

  /**
   * main.
   *
   * @param args
   */
  public static void main(final String[] args) {
    String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String b = "bbbbbbbbbb";
    System.out.println(a + b);
    SpringApplication.run(DemoApplication.class, args);
  }
}
