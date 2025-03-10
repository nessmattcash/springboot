package tn.esprit.nessmattcash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.nessmattcash.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {

    // 1. Trouver les réservations d'une année universitaire donnée et d'une université spécifique
    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversite " +
            "AND r.chambre.bloc.foyer.universite.nomUniversite = :nomUniversite")
    List<Reservation> findReservationsByUniversityAndYear(@Param("anneeUniversite") Date anneeUniversite,
                                                          @Param("nomUniversite") String nomUniversite);
}
