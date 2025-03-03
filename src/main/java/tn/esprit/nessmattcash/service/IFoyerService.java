package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(long idFoyer);
    void removeFoyer(long idFoyer);
}
