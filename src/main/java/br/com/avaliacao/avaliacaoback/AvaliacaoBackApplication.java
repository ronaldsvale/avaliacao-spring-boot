package br.com.avaliacao.avaliacaoback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.avaliacao.avaliacaoback.repository")
public class AvaliacaoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoBackApplication.class, args);
	}

}
