package br.com.bnp.teste.movimento_manual.repository;

import java.util.List;

import br.com.bnp.teste.movimento_manual.dto.MovimentoDTO;
import br.com.bnp.teste.movimento_manual.entity.Movimento;

public interface MovimentoRepositoryCustom {
	
	List<Movimento> getAllMovimento();
}
