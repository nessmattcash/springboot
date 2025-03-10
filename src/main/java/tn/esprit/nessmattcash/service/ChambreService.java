package tn.esprit.nessmattcash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.entities.Reservation;
import tn.esprit.nessmattcash.entities.TypeChambre;
import tn.esprit.nessmattcash.repository.IChambreRepository;
import tn.esprit.nessmattcash.repository.IReservationRepository;

import java.util.Date;
import java.util.List;

@Service
public class ChambreService implements IChambreService {

    @Autowired
    private IChambreRepository chambreRepository;

    @Autowired
    private IReservationRepository reservationRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll(); // Conversion Iterable -> List
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }


    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambreRepository.findNonReservedRoomsByUniversityAndType(nomUniversite, type);
    }


    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) {
        return reservationRepository.findReservationsByUniversityAndYear(anneeUniversite, nomUniversite);
    }


    @Override
    public List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC) {
        return chambreRepository.findChambresByBlocAndTypeJPQL(idBloc, typeC);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);
    } }
