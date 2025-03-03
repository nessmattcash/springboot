package tn.esprit.nessmattcash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nessmattcash.entities.Universite;
import tn.esprit.nessmattcash.repository.IUniversiteRepository;

import java.util.List;


@Service
public class UniversiteService implements IUniversiteService {

    @Autowired
    private IUniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return  (List<Universite>) universiteRepository.findAll(); // Conversion Iterable -> List
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }
}
