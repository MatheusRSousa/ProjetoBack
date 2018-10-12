package br.unifacisa.si.treinamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.Sala;

@Repository
public interface DBSalaRepository extends MongoRepository<Sala, String>{

}
