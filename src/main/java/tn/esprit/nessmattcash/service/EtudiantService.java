package tn.esprit.nessmattcash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nessmattcash.entities.Etudiant;
import tn.esprit.nessmattcash.repository.IEtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService implements IEtudiantService {

    @Autowired
    private IEtudiantRepository etudiantRepository; // Corrected

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll(); // Now correctly calls the repository method
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepository.saveAll(etudiants); // Now correctly calls the repository method
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e); // Now correctly calls the repository method
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null); // Now correctly calls the repository method
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant); // Now correctly calls the repository method
    }
}
