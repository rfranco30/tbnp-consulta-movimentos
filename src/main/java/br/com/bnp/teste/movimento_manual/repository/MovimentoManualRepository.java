package br.com.bnp.teste.movimento_manual.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.bnp.teste.movimento_manual.entity.MovimentoManual;
import br.com.bnp.teste.movimento_manual.entity.MovimentoManualPK;

@Repository
public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, MovimentoManualPK>{

	
	@Query("SELECT max(m.numLancamento) FROM MovimentoManual m")
	Long findMaxNumLancamento();
	
}
