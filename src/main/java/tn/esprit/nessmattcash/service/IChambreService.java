package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.entities.Reservation;
import tn.esprit.nessmattcash.entities.TypeChambre;

import java.util.Date;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(long idChambre);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite);
    List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC);
    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);
}
