package tn.esprit.nessmattcash.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nessmattcash.entities.Bloc;

public interface IBlocRepository extends CrudRepository<Bloc, Long> {
}
