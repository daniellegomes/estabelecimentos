package br.com.fiap.smartcities.dao;

import br.com.fiap.entity.TipoEstabelecimento;

import javax.persistence.EntityManager;
import java.util.Calendar;
import java.util.List;

public class TipoEstabelecimentoDAO extends GenericDAO<TipoEstabelecimento, Integer> {

    public TipoEstabelecimentoDAO(EntityManager em) {
        super(em);
    }

    @Override
    public List<TipoEstabelecimento> listar() {
        return this.em.createQuery("from TipoEstabelecimento").getResultList();
    }

    public List<TipoEstabelecimento> listarOrdenadoNome() {
        return this.em.createQuery("from TipoEstabelecimento order by nome").getResultList();
    }

    public List<TipoEstabelecimento> listarTresUltimos() {
        return this.em.createQuery("from TipoEstabelecimento order by id desc").setMaxResults(3).getResultList();
    }

    public List<TipoEstabelecimento> listarPaginado(int intensPorPagina, int pagina) {
        int primeiro = (pagina - 1) * intensPorPagina;

        return this.em.createQuery("from TipoEstabelecimento order by nome")
                .setMaxResults(intensPorPagina)
                .setFirstResult(primeiro)
                .getResultList();
    }

    public int alterarTipoTodos(TipoEstabelecimento tipo) {
        em.getTransaction().begin();

        Object novoTipo = new Object();
        int total = this.em.createQuery(
                "update Estabelecimento e set e.tipo = :tipo"
        ).setParameter("tipo",novoTipo)
                .executeUpdate();
        em.getTransaction().commit();
        return total;
    }
    public void excluirAntesDe(Calendar data){
        em.getTransaction().begin();
        this.em.createQuery("delete from Estabelecimento e " +
                "where dataCriacao < :data"
        ).setParameter("data",data)
                .executeUpdate();
        em.getTransaction().commit();
    }

}
