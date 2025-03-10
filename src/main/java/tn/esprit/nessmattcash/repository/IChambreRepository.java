package tn.esprit.nessmattcash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.entities.TypeChambre;

import java.util.List;

public interface IChambreRepository extends JpaRepository<Chambre, Long> {


    @Query("SELECT c FROM Chambre c " +
            "WHERE c.typeC = :type AND c.bloc.foyer.universite.nomUniversite = :nomUniversite " +
            "AND c.idChambre NOT IN (SELECT r.chambre.idChambre FROM Reservation r)")
    List<Chambre> findNonReservedRoomsByUniversityAndType(@Param("nomUniversite") String nomUniversite,
                                                          @Param("type") TypeChambre type);


    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :typeC")
    List<Chambre> findChambresByBlocAndTypeJPQL(@Param("idBloc") long idBloc,
                                                @Param("typeC") TypeChambre typeC);


    List<Chambre> findByBlocIdBlocAndTypeC(long idBloc, TypeChambre typeC);
}
