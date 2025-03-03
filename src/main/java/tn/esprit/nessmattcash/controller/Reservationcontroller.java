package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Reservation;
import tn.esprit.nessmattcash.service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class Reservationcontroller {

    @Autowired
    private IReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation res) {
        return reservationService.updateReservation(res);
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable("id") String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }
}
