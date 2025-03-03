package tn.esprit.nessmattcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nessmattcash.entities.Bloc;
import tn.esprit.nessmattcash.service.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/blocs")
public class Bloccontroller {

    @Autowired
    private IBlocService blocService;

    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocService.retrieveBlocs();
    }

    @PostMapping
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @PutMapping
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/{id}")
    public Bloc getBloc(@PathVariable("id") long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable("id") long idBloc) {
        blocService.removeBloc(idBloc);
    }
}
