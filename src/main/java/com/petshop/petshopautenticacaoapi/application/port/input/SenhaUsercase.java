package com.petshop.petshopautenticacaoapi.application.port.input;

import com.petshop.petshopautenticacaoapi.application.domain.SenhaDomain;

public interface SenhaUsercase {

    SenhaDomain getByID(Long id) throws Exception;;

    SenhaDomain create(SenhaDomain senhaDomain) throws Exception;;

    SenhaDomain getByIdUsuario(Long idUsuario) throws Exception;;

    SenhaDomain getByUsuarioAndSenha(String usuario, String senha) throws Exception;;

}
