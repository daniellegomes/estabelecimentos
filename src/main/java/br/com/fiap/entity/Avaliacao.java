package br.com.fiap.entity;


import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(AvaliacaoId.class)
public class Avaliacao  implements Serializable{

    @Id
    @JoinColumn(name = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    @Id
    @JoinColumn(name = "id_estabelecimento")
    @ManyToOne(optional = false)
    private Estabelecimento estabelecimento;

    private int nota;

    //@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_avaliacao")
    private Calendar dataAvaliacao;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Calendar getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Calendar dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }



}

