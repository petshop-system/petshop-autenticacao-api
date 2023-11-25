package com.petshop.petshopautenticacaoapi.adapter.input.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petshop.petshopautenticacaoapi.application.domain.SenhaDomain;
import com.petshop.petshopautenticacaoapi.application.service.SenhaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/senha",
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class SenhaController {

    private final SenhaService senhaService;

    private final ObjectMapper objectMapper;

    public SenhaController(SenhaService senhaService, ObjectMapper objectMapper) {
        this.senhaService = senhaService;
        this.objectMapper = objectMapper;
    }

    @PostMapping(path = "/save")
    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseHTTP save (@RequestBody SenhaRequest senhaRequest) throws Exception {

        SenhaDomain senhaDomain = senhaRequest.toSenhaDomain();
        senhaDomain = senhaService.create(senhaDomain);

        SenhaResponse senhaResponse = new SenhaResponse(senhaDomain.getUsuario(), senhaRequest.idUsuario());

        return new ResponseHTTP("Sucesso ao criar senha", senhaResponse);
    }
}
