package br.com.bnp.teste.movimento_manual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bnp.teste.movimento_manual.entity.Movimento;
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

}
