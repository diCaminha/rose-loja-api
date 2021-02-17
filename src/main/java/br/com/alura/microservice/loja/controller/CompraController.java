package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.service.CompraService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {

	private CompraService compraService;

	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody CompraDTO compra) {

	}
}
