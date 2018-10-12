package br.unifacisa.si.treinamento.service;

import br.unifacisa.si.treinamento.repository.*;


//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.*;

@Service
public class AlunoService {
	
	@Autowired
	private DBAlunoRepository repository;

	
	
	public Aluno addAluno(Aluno aluno) {
		return repository.insert(aluno);
	}
	
	
	
}
