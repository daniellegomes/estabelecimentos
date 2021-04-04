package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente_pf")
public class ClientePf {

    @Column(name="estado_civil", length =20)
    private String estadoCivil;

    @Column(length=20)
    private String escolaridade;

    @Column(name = "ID", nullable = false)
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ClientePf() {
        super();

    }


    public ClientePf(String estadoCivil, String escolaridade) {
        super();
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }


}