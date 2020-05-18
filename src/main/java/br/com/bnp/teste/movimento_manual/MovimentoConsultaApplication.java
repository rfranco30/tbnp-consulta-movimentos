package br.com.bnp.teste.movimento_manual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories
@EnableDiscoveryClient
@SpringBootApplication
public class MovimentoConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovimentoConsultaApplication.class, args);
	}

}
