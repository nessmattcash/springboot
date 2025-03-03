package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Foyer;
import tn.esprit.nessmattcash.service.IFoyerService;

import java.util.List;

public class Foyercontroller {
    @RestController
    @RequestMapping("/foyers")
    public class FoyerController {

        @Autowired
        IFoyerService foyerService;

        @GetMapping
        public List<Foyer> getAllFoyers() {
            return foyerService.retrieveAllFoyers();
        }

        @PostMapping
        public Foyer createFoyer(@RequestBody Foyer f) {
            return foyerService.addFoyer(f);
        }

        @PutMapping
        public Foyer updateFoyer(@RequestBody Foyer f) {
            return foyerService.updateFoyer(f);
        }

        @GetMapping("/{id}")
        public Foyer getFoyer(@PathVariable("id") long idFoyer) {
            return foyerService.retrieveFoyer(idFoyer);
        }

        @DeleteMapping("/{id}")
        public void deleteFoyer(@PathVariable("id") long idFoyer) {
            foyerService.removeFoyer(idFoyer);
        }
    }
}
