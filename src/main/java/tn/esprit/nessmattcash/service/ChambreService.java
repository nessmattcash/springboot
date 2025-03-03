package tn.esprit.nessmattcash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.repository.IChambreRepository;

import java.util.List;

@Service
public class ChambreService implements IChambreService {

    @Autowired
    private IChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return  (List<Chambre>) chambreRepository.findAll(); // Conversion Iterable -> List
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
}
