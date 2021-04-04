package br.com.fiap.entity;

import org.hibernate.mapping.Collection;

import javax.persistence.*;

@Entity
@Table(name = "tipode_estabelecimento")
public class TipoEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_estabelecimento")
    private Integer id;

    @Column(name="nome_tipo_estabelecimento", length=25,nullable=false)
    private String nome;



    public TipoEstabelecimento(Integer id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }
    @OneToMany(mappedBy = "tipo")
    private Collection estabelecimentos;

    //Construtores, getters e setters

    public TipoEstabelecimento() {
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
