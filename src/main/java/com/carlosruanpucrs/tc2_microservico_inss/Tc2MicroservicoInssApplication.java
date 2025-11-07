package com.carlosruanpucrs.tc2_microservico_inss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Tc2MicroservicoInssApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tc2MicroservicoInssApplication.class, args);
    }

}
