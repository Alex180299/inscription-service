package com.api.inscriptionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Clase principal de la ejecución de spring
 */
@RibbonClient(name = "school-service")
@EnableFeignClients
@SpringBootApplication
public class InscriptionsServiceApplication {

	/**
	 * Método principal que inicia el servidor embebido con spring
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(InscriptionsServiceApplication.class, args);
	}

}
