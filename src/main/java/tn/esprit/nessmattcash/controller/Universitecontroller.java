package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Universite;
import tn.esprit.nessmattcash.service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universites")
public class Universitecontroller {

    @Autowired
    private IUniversiteService universiteService;

    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversities();
    }

    @PostMapping
    public Universite createUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.updateUniversite(u);
    }

    @GetMapping("/{id}")
    public Universite getUniversite(@PathVariable("id") long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
}
