package br.com.bnp.teste.movimento_manual.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	private String codProduto;
	private String desProduto;
}
