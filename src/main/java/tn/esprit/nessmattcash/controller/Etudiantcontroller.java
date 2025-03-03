package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Etudiant;
import tn.esprit.nessmattcash.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class Etudiantcontroller {

    @Autowired
    IEtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping
    public List<Etudiant> createEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable("id") long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable("id") long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
