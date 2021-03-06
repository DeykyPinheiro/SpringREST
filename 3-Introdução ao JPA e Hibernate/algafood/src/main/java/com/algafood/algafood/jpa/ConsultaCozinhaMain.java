package com.algafood.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algafood.algafood.AlgafoodApplication;
import com.algafood.algafood.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		
		cadastroCozinha.listar();
//		
//		for (Cozinha cozinha : cozinhas) {
//			System.out.println(cozinha.getNome());
//		}
	}
	
}