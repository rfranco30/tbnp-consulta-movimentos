package br.com.bnp.teste.movimento_manual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bnp.teste.movimento_manual.entity.Movimento;
import br.com.bnp.teste.movimento_manual.entity.MovimentoManual;
import br.com.bnp.teste.movimento_manual.repository.MovimentoManualRepository;
import br.com.bnp.teste.movimento_manual.repository.MovimentoRepositoryCustom;

@Service
public class MovimentoService {

	@Autowired
	private MovimentoManualRepository movManualrepository;
	
	@Autowired
	private MovimentoRepositoryCustom movCustomRepository;
	
	public List<Movimento> getAll(){
		return movCustomRepository.getAllMovimento();
	}
	
	public MovimentoManual insert(MovimentoManual mov) {
		return movManualrepository.save(mov);
	}
	
	
}
