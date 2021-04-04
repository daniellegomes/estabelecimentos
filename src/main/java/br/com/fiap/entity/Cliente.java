package br.com.fiap.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cliente")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Cliente {

    @Id
    @SequenceGenerator(name="cliente",sequenceName="sq_tb_cliente",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cliente")
    @Column(name="id_cliente")
    private int id;

    @Column(name="nm_cliente", nullable = false)
    private String nome;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "id_cliente"), inverseJoinColumns = @JoinColumn(name="id_estabelecimento"), name = "cliente_estabelecimento")
    private List<Estabelecimento> estabelecimentos;



    public Cliente() {
        super();

    }

    public Cliente(int id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}