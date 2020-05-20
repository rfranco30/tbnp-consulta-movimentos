package br.com.bnp.teste.movimento_manual.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movimento_manual", schema = "testebnp")
@IdClass(MovimentoManual.class)
public class MovimentoManual implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4106849477601772919L;

	@Id
	private Integer datMes;
	
	@Id
	private Integer datAno;
	
	@Id
	@Column(columnDefinition = "bpchar")
	private String codProduto;

	@Id
	@Column(columnDefinition = "bpchar")
	private String codCosif;
	
	@Id
	private Long numLancamento;
	
	private String desDescricao;
	
	private BigDecimal valValor;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datMovimento;

	private String codUsuario;

}
