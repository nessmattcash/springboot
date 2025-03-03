package tn.esprit.nessmattcash.service;

import tn.esprit.nessmattcash.entities.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation(Reservation res);
    Reservation retrieveReservation(String idReservation);
}
