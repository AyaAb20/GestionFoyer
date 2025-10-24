package org.example.tpgestiondeschambre.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Bloc;

import org.example.tpgestiondeschambre.service.IBlocService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Gestion Bloc")
@AllArgsConstructor
@RestController
@RequestMapping("/Bloc")

public class BlocRestController {
    IBlocService blocService;

    //http://localhost:8083/tpGestiondesBloc/retrieve-all-Blocs
    @Operation(description = "récupérer toutes les Blocs  de la base de données")
    @GetMapping("/retrieve-all-Blocs")
    public List<Bloc> retrieveAllBlocs() {
        List<Bloc> blocList = blocService.retrieveAllBlocs();
        return blocList;
    }

    //http://localhost:8083/tpGestiondesBloc/retrieve-Blocs/8
    @Operation(description = "ajouter le Bloc  de la base de données")
    @GetMapping("/retrive-Bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long chId /*,@PathVariable another variable*/){
        Bloc bloc= blocService.retrieveBloc(chId);
        return bloc;
    }

    //http://localhost:8083/tpGestiondesBloc/Bloc/add-Bloc
    @Operation(description = "ajouter le Bloc   de la base de données")
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

    //http://localhost:8083/tpGestiondesBloc/remove-Blocs/8
    @Operation(description = "supprimer le Bloc   de la base de données")
    @DeleteMapping("/remove-Bloc/{Bloc-id}")
    public void Removebloc(@PathVariable ("bloc-id") Long chId /*,@PathVariable another variable*/){
        blocService.removeBloc(chId);
    }

    //http://localhost:8083/tpGestiondesBloc/retrieve-all-Blocs
    @Operation(description = "modifier le Bloc de la base de données")
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }
}
