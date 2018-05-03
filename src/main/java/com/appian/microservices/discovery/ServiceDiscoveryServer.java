package com.appian.microservices.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Registry
 *
 * @author touré
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryServer {
  public static void main(String[] args) {
    SpringApplication.run(ServiceDiscoveryServer.class, args);
  }
}
