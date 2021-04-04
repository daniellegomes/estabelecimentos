package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {

	@Id
	@Column(name="id_estabelecimento")
	@SequenceGenerator(name="estabelecimento",sequenceName="sq_tb_estabelecimento",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="estabelecimento")
	private int id;

	@Column(name="nm_estabelecimento")
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_criacao")
	private Calendar dataCriacao;

	@JoinColumn(name="id_tipo_estabelecimento")
	@ManyToOne
	private TipoEstabelecimento tipo;

	@OneToOne(mappedBy="estabelecimento")
	private ContratoAluguel contrato;

	@ManyToMany(mappedBy="estabelecimentos")
	private List<Cliente> clientes;

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(int id, String nome, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

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

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}



}
