package org.example.tpgestiondeschambre.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Chambre;
import org.example.tpgestiondeschambre.service.IChambreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Chambre")
@AllArgsConstructor
@RestController
@RequestMapping("/Chambre")
public class ChambreRestController {

    IChambreService ChambreService;



    //http://localhost:8083/tpGestiondeschambre/retrieve-all-chambres
    @Operation(description = "récupérer toutes les chambres de la base de données")
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> chambreList = ChambreService.retrieveAllChambres();
        return chambreList;
    }

    //http://localhost:8083/tpGestiondeschambre/retrieve-chambres/8
    @Operation(description = "retrie le chambre de la base de données")
    @GetMapping("/retrive-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable ("chambre-id") Long chId /*,@PathVariable another variable*/){
     Chambre chambre= ChambreService.retrieveChambre(chId);
        return chambre;
    }

    //http://localhost:8083/tpGestiondeschambre/chambre/add-chambre
    @Operation(description = "ajouter le chambre de la base de données")
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.addChambre(c);
        return chambre;
    }

    //http://localhost:8083/tpGestiondeschambre/remove-chambres/8
    @Operation(description = "supprime le chambre de la base de données")
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void RemoveChambre(@PathVariable ("chambre-id") Long chId /*,@PathVariable another variable*/){
        ChambreService.removeChambre(chId);
    }

    //http://localhost:8083/tpGestiondeschambre/retrieve-all-chambres
    @Operation(description = "modifier le chambre de la base de données")
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.modifyChambre(c);
        return chambre;
    }

}
