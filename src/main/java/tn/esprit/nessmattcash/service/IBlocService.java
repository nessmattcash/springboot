package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc(Bloc bloc);
    Bloc addBloc(Bloc bloc);
    Bloc retrieveBloc(long idBloc);
    void removeBloc(long idBloc);
}
