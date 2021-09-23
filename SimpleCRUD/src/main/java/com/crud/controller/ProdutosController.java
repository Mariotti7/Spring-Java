package com.crud.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class ProdutosController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@GetMapping("/produto")
	public String getProduto() {
		return "Produto on";
	}
	
	@GetMapping
	public String getIntro() {
		return "Welcome to the Store";
	}

}
