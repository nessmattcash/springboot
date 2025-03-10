package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.entities.Reservation;
import tn.esprit.nessmattcash.entities.TypeChambre;
import tn.esprit.nessmattcash.service.IChambreService;
import tn.esprit.nessmattcash.service.IReservationService;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/chambres")
public class Chambrecontroller {

    @Autowired
    private IChambreService chambreService;

    @Autowired
    private IReservationService reservationService;

    // ✅ Récupérer toutes les chambres
    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    // ✅ Ajouter une chambre
    @PostMapping
    public Chambre createChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    // ✅ Mettre à jour une chambre
    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    // ✅ Récupérer une chambre par son ID
    @GetMapping("/{id}")
    public Chambre getChambre(@PathVariable("id") long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    // ✅ Récupérer les chambres non réservées par université et type de chambre
    @GetMapping("/non-reservees")
    public List<Chambre> getChambresNonReservees(
            @RequestParam String nomUniversite,
            @RequestParam TypeChambre type) {
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, type);
    }



    @GetMapping("/reservations")
    public List<Reservation> getReservationsParAnneeUniversitaire(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anneeUniversitaire,
            @RequestParam String nomUniversite) {
        return chambreService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversitaire, nomUniversite);
    }


    // ✅ Récupérer les chambres d'un bloc par type (JPQL)
    @GetMapping("/bloc/{idBloc}/type/{typeC}/jpql")
    public List<Chambre> getChambresParBlocEtTypeJPQL(
            @PathVariable long idBloc,
            @PathVariable TypeChambre typeC) {
        return chambreService.getChambresParBlocEtTypeJPQL(idBloc, typeC);
    }


    @GetMapping("/bloc/{idBloc}/type/{typeC}/keywords")
    public List<Chambre> getChambresParBlocEtTypeKeywords(
            @PathVariable long idBloc,
            @PathVariable TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }
}
