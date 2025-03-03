package tn.esprit.nessmattcash.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nessmattcash.entities.Reservation;

public interface IReservationRepository extends CrudRepository<Reservation, Long> {
}
