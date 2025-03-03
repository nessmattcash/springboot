package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    Universite retrieveUniversite(long idUniversite);
}
