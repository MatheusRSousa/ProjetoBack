package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.Aluno;

@Repository
public interface DBAlunoRepository extends MongoRepository<Aluno, String> {

}
