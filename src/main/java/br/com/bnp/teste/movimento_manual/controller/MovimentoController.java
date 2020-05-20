package br.com.bnp.teste.movimento_manual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bnp.teste.movimento_manual.entity.Movimento;
import br.com.bnp.teste.movimento_manual.entity.MovimentoManual;
import br.com.bnp.teste.movimento_manual.service.MovimentoService;

@RestController
@RequestMapping("movimento")
public class MovimentoController {

	@Autowired 
	MovimentoService service;
	
	@GetMapping
	public ResponseEntity<List<Movimento>> getAll() {
		
		return new ResponseEntity<List<Movimento>>(service.getAll(),HttpStatus.OK);
		
		
	}
	
	@PostMapping
	public ResponseEntity<?>save(@RequestBody MovimentoManual mov){
		service.insert(mov);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(params = "lancamento=max")
	public ResponseEntity<Long> getNumeroLancamento() {
		return new ResponseEntity<Long>(service.getMaxNumLancamento(),HttpStatus.OK);
	}

}
