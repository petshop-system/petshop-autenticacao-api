package com.petshop.petshopautenticacaoapi.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petshop.petshopautenticacaoapi.adapter.output.repository.cache.SenhaRedisRepository;
import com.petshop.petshopautenticacaoapi.adapter.output.repository.database.SenhaDatabaseRepository;
import com.petshop.petshopautenticacaoapi.adapter.output.repository.database.SenhaJPARepository;
import com.petshop.petshopautenticacaoapi.application.port.output.repository.SenhaCacheRepository;
import com.petshop.petshopautenticacaoapi.application.port.output.repository.SenhaDatabaseRespository;
import com.petshop.petshopautenticacaoapi.application.service.SenhaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenhaConfiguration {

    @Bean
    SenhaDatabaseRespository senhaDatabaseRespository (SenhaJPARepository senhaJPARepository) {
        return new SenhaDatabaseRepository(senhaJPARepository);
    }

    @Bean
    SenhaCacheRepository senhaCacheRepository(SenhaRedisRepository senhaRedisRepository,
                                              ObjectMapper objectMapper){
        return new com.petshop.petshopautenticacaoapi.adapter.output.repository.cache.SenhaCacheRepository(senhaRedisRepository, objectMapper);
    }

    @Bean
    SenhaService senhaService (SenhaDatabaseRespository senhaDatabaseRespository,
                               SenhaCacheRepository senhaCacheRepository) {
        return new SenhaService(senhaCacheRepository, senhaDatabaseRespository);
    }
}
