package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.Turma;

@Repository
public interface DBTurmaRepository extends MongoRepository<Turma, String>{

}
