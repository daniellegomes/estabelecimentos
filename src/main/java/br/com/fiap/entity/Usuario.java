package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@SequenceGenerator(name="usuario",sequenceName="sq_tb_usuario",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	@Column(name="id_usuario")
	private int id;
	
	@Column(name="nm_usuario")
	private String nome;
	
	private String senha;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dt_criacao")
	private Calendar dataCriacao;

	//Construtores
	
	public Usuario() {
		super();
		
	}

	public Usuario(int id, String nome, String senha, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
	}
	
	//Getters e Setters

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	} 

	
	
}
