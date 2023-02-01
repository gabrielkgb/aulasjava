package br.com.senacniteroi.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    ARQUITETURA MVC
 * MODELS - SERÃO O MODELO DAS REQUISIÇÕES
 * VIEWS - FRONTED PRONTO PRONTO QUE EXIBIRA O RESULTADO DAS REQUISIÇÕES
 * CONTROLLERS -VAO ADMINISTRAR AS REQUISIÇÕES
 * SERVICES - VÃO "SERVIR" AS REQUISIÇÕES
 * 
 * 
 * 
 * 
 * 
 */

@SpringBootApplication
public class SpringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

}
