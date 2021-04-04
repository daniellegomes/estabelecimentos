package br.com.fiap.smartcities.service;

import br.com.fiap.entity.TipoEstabelecimento;
import br.com.fiap.smartcities.dao.TipoEstabelecimentoDAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.rmi.RemoteException;

public class TipoEstabelecimentoServiceImpl implements TipoEstabelecimentoService{

    protected TipoEstabelecimentoServiceImpl()throws RemoteException{
        super();
    }


    public String pesquisar(Integer idPesquisa) throws RemoteException {

        EntityManager em = Persistence.createEntityManagerFactory("smartcities")
                .createEntityManager();

        TipoEstabelecimentoDAO dao = new TipoEstabelecimentoDAO(em);

        TipoEstabelecimento tipoEstabelecimento = dao.buscar(idPesquisa);

        if (tipoEstabelecimento != null){
            return tipoEstabelecimento.getNome();
        }
        else{
            return null;
        }
    }
}
