package com.petshop.petshopautenticacaoapi.adapter.input.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.petshop.petshopautenticacaoapi.application.domain.SenhaDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public record SenhaResponse (@JsonInclude(JsonInclude.Include.NON_NULL)
                             @JsonProperty("usuario")
                             String usuario,
                             @JsonInclude(JsonInclude.Include.NON_NULL)
                             @JsonProperty("id_usuario")
                             Long idUsuario) {

}
