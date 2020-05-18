package br.com.bnp.teste.movimento_manual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bnp.teste.movimento_manual.entity.Movimento;
import br.com.bnp.teste.movimento_manual.repository.MovimentoRepositoryCustom;

@Service
public class MovimentoService {

	@Autowired
	private MovimentoRepositoryCustom repository;
	
	public List<Movimento> getAll(){
		return repository.getAllMovimento();
	}
	
	
}
