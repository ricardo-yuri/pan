package com.pan.aulaumspring;

import com.pan.aulaumspring.entity.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AulaumspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaumspringApplication.class, args);

		Produto produto = new Produto();
		produto.setDescricao("Luva");
		produto.setValor(20.5);

		System.out.println(produto);
		System.out.println(produto.getDescricao());
		System.out.println(produto.getValor());

	}

}
