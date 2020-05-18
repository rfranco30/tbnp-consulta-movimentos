package br.com.bnp.teste.movimento_manual.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movimento {
	private Integer datMes;
	private Integer datAno;
	private String codProduto;
	private String desProduto;
	private Long numLancament;
	private String desDescricao;
	private BigDecimal valValor;
}
