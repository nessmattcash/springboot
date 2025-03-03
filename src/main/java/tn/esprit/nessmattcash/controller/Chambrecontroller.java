package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Chambre;
import tn.esprit.nessmattcash.service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")
public class Chambrecontroller {

    @Autowired
    private IChambreService chambreService;

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @GetMapping("/{id}")
    public Chambre getChambre(@PathVariable("id") long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }
}
