package org.example.tpgestiondeschambre.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Universite;

import org.example.tpgestiondeschambre.service.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Gestion Universite")
@AllArgsConstructor
@RestController
@RequestMapping("/Universite")

public class UniversiteRestController {
    IUniversiteService universiteService;

    //http://localhost:8083/tpGestiondesUniversite/retrieve-all-Universites
    @Operation(description = "récupérer toutes les Universites  de la base de données")
    @GetMapping("/retrieve-all-Universites")
    public List<Universite> retrieveAllUniversites() {
        List<Universite> universiteList = universiteService.retrieveAllUniversites();
        return universiteList;
    }

    //http://localhost:8083/tpGestiondesUniversite/retrieve-Universites/8
    @Operation(description = "ajouter le Universite  de la base de données")
    @GetMapping("/retrive-Universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId /*,@PathVariable another variable*/){
        Universite universite= universiteService.retrieveUniversite(chId);
        return universite;
    }

    //http://localhost:8083/tpGestiondesUniversite/Universite/add-Universite
    @Operation(description = "ajouter le Universite  de la base de données")
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    //http://localhost:8083/tpGestiondesUniversite/remove-Universites/8
    @Operation(description = "supprimer le Universite   de la base de données")
    @DeleteMapping("/remove-Universite/{Universite-id}")
    public void Removeuniversite(@PathVariable ("universite-id") Long chId /*,@PathVariable another variable*/){
        universiteService.removeUniversite(chId);
    }

    //http://localhost:8083/tpGestiondesUniversite/retrieve-all-Universites
    @Operation(description = "modifier le Universite de la base de données")
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.modifyUniversite(u);
        return universite;
    }
}
