package br.com.bnp.teste.movimento_manual.dto;

import java.math.BigDecimal;

import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.SqlResultSetMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovimentoDTO {
	private Integer datMes;
	private Integer datAno;
	private String codProduto;
	private String desProduto;
	private Long numLancament;
	private String desDescricao;
	private BigDecimal valValor;
}
