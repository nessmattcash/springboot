package tn.esprit.nessmattcash.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nessmattcash.entities.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
}
