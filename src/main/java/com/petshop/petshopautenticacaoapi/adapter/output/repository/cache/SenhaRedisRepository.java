package com.petshop.petshopautenticacaoapi.adapter.output.repository.cache;

import org.springframework.data.repository.CrudRepository;

public interface SenhaRedisRepository  extends CrudRepository<SenhaCache, String> {
}
