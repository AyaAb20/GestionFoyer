package org.example.tpgestiondeschambre.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Etudiant;

import org.example.tpgestiondeschambre.service.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Gestion Etudiant")
@AllArgsConstructor
@RestController
@RequestMapping("/Etudiant")

public class EtudiantRestController {
    IEtudiantService etudiantService;

    //http://localhost:8083/tpGestiondesEtudiant/retrieve-all-Etudiants
    @Operation(description = "récupérer toutes les etudiants  de la base de données")
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> etudiantList = etudiantService.retrieveAllEtudiants();
        return etudiantList;
    }

    //http://localhost:8083/tpGestiondesEtudiant/retrieve-Etudiants/8
    @Operation(description = "retrive le etudiant  de la base de données")
    @GetMapping("/retrive-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long chId /*,@PathVariable another variable*/){
        Etudiant etudiant= etudiantService.retrieveEtudiant(chId);
        return etudiant;
    }

    //http://localhost:8083/tpGestiondesEtudiant/Etudiant/add-Etudiant
    @Operation(description = "ajouter le etudiant  de la base de données")
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    //http://localhost:8083/tpGestiondesEtudiant/remove-Etudiants/8
    @Operation(description = "supprimer le etudiant  de la base de données")
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void Removeetudiant(@PathVariable ("etudiant-id") Long chId /*,@PathVariable another variable*/){
        etudiantService.removeEtudiant(chId);
    }

    //http://localhost:8083/tpGestiondesEtudiant/retrieve-all-Etudiants
    @Operation(description = "modifier le etudiant de la base de données")
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }
}
