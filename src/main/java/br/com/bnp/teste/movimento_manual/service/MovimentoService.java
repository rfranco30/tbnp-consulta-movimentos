package br.com.bnp.teste.movimento_manual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bnp.teste.movimento_manual.entity.Movimento;
import br.com.bnp.teste.movimento_manual.entity.MovimentoManual;
import br.com.bnp.teste.movimento_manual.repository.MovimentoManualRepository;
import br.com.bnp.teste.movimento_manual.repository.MovimentoRepositoryCustom;

@Service
public class MovimentoService {

	public static final String USER = "TESTE";
	@Autowired
	private MovimentoManualRepository movManualrepository;
	
	@Autowired
	private MovimentoRepositoryCustom movCustomRepository;
	
	public List<Movimento> getAll(){
		return movCustomRepository.getAllMovimento();
	}
	
	public MovimentoManual insert(MovimentoManual mov) {
		mov.setCodUsuario(USER);
		mov.setDatMovimento(new Date());
		return movManualrepository.save(mov);
	}
	
	public Long getMaxNumLancamento() {
		return movManualrepository.findMaxNumLancamento();
	}
	
	
}
