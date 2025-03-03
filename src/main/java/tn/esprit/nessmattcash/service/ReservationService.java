package tn.esprit.nessmattcash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nessmattcash.entities.Reservation;
import tn.esprit.nessmattcash.repository.IReservationRepository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private IReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll(); // Conversion Iterable -> List
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(Long.valueOf(idReservation)).orElse(null);
    }
}
