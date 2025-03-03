package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Chambre;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(long idChambre);
}
