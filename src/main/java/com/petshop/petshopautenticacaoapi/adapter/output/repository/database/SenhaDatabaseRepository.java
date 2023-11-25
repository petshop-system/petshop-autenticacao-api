package com.petshop.petshopautenticacaoapi.adapter.output.repository.database;

import com.petshop.petshopautenticacaoapi.application.domain.SenhaDomain;
import com.petshop.petshopautenticacaoapi.application.port.output.repository.SenhaDatabaseRespository;

public class SenhaDatabaseRepository implements SenhaDatabaseRespository {

    private final SenhaJPARepository senhaJPARepository;

    public SenhaDatabaseRepository(SenhaJPARepository senhaJPARepository) {
        this.senhaJPARepository = senhaJPARepository;
    }

    @Override
    public SenhaDomain Save(SenhaDomain senhaDomain) throws Exception {

        SenhaDatabase senhaDatabase = new SenhaDatabase(senhaDomain);
        SenhaDatabase save = this.senhaJPARepository.save(senhaDatabase);

        return save.toSenhaDomain();
    }

    @Override
    public SenhaDomain getByID(Long id) throws Exception {
        return null;
    }

    @Override
    public SenhaDomain getByIdUsuario(Long idUsuario) throws Exception {
        return null;
    }

    @Override
    public SenhaDomain getByUsuarioAndSenha(String usuario, String senha) throws Exception {
        return null;
    }
}
