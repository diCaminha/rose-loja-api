package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    private RestTemplate restTemplate;

    public CompraService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void realizaCompra(CompraDTO compraDTO) {
        ResponseEntity<InfoFornecedorDTO> response = this.restTemplate.exchange(
                "http://fornecedor/info/" + compraDTO.getEndereco().getEstado(),
                HttpMethod.GET,
                null,
                InfoFornecedorDTO.class);

        System.out.println(response.getBody().getEndereco());
    }
}
