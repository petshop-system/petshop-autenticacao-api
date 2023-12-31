package com.petshop.petshopautenticacaoapi.adapter.input.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public record SenhaResponse (@JsonInclude(JsonInclude.Include.NON_NULL)
                             @JsonProperty("usuario")
                             String usuario,
                             @JsonInclude(JsonInclude.Include.NON_NULL)
                             @JsonProperty("id_usuario")
                             Long idUsuario) {

}
