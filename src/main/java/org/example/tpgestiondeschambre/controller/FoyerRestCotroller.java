package org.example.tpgestiondeschambre.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Foyer;
import org.example.tpgestiondeschambre.service.IFoyerService;
import org.springframework.web.bind.annotation.*;




import java.util.List;
@Tag(name = "Gestion Foyer")
@AllArgsConstructor
@RestController
@RequestMapping("/Foyer")

public class FoyerRestCotroller {
    IFoyerService foyerService;

    //http://localhost:8083/tpGestiondesFoyer/retrieve-all-Foyers
    @Operation(description = "récupérer toutes les foyers  de la base de données")
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> retrieveAllFoyers() {
        List<Foyer> foyerList = foyerService.retrieveAllFoyers();
        return foyerList;
    }

    //http://localhost:8083/tpGestiondesFoyer/retrieve-Foyers/8
    @Operation(description = "retrive le foyer  de la base de données")
    @GetMapping("/retrive-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId /*,@PathVariable another variable*/){
        Foyer foyer= foyerService.retrieveFoyer(chId);
        return foyer;
    }

    //http://localhost:8083/tpGestiondesFoyer/Foyer/add-Foyer
    @Operation(description = "ajouter le foyer  de la base de données")
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    //http://localhost:8083/tpGestiondesFoyer/remove-Foyers/8
    @Operation(description = "supprimer le foyer  de la base de données")
    @DeleteMapping("/remove-Foyer/{Foyer-id}")
    public void Removefoyer(@PathVariable ("foyer-id") Long chId /*,@PathVariable another variable*/){
        foyerService.removeFoyer(chId);
    }

    //http://localhost:8083/tpGestiondesFoyer/retrieve-all-Foyers
    @Operation(description = "modifier le foyer de la base de données")
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.modifyFoyer(f);
        return foyer;
    }
}
