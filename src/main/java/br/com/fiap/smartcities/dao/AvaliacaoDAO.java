package br.com.fiap.smartcities.dao;

import br.com.fiap.entity.Avaliacao;
import br.com.fiap.entity.AvaliacaoId;

import javax.persistence.EntityManager;


public class AvaliacaoDAO extends GenericDAO<Avaliacao, AvaliacaoId>{

    public AvaliacaoDAO(EntityManager em) {
        super(em);
    }

}