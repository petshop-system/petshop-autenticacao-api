package com.petshop.petshopautenticacaoapi.application.port.output.repository;

import com.petshop.petshopautenticacaoapi.application.domain.SenhaDomain;

public interface SenhaCacheRepository {

    void set(SenhaDomain senhaDomain) throws Exception;
    SenhaDomain get(String key) throws Exception;
    void delete(String key) throws Exception;
}
