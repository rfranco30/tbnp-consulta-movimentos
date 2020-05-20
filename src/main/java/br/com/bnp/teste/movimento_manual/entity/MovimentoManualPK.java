package br.com.bnp.teste.movimento_manual.entity;

import java.io.Serializable;

public class MovimentoManualPK implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 2480486315280502365L;
	Integer datMes;
	Integer datAno;
	String codCosif;
	String codProduto;
	Long numLancamento;
}