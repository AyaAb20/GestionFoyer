package org.example.tpgestiondeschambre.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.example.tpgestiondeschambre.entities.Reservation;

import org.example.tpgestiondeschambre.service.IResevationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Resevation")
@AllArgsConstructor
@RestController
@RequestMapping("/Resevation")

public class ReservationRestController {
    IResevationService reservationService;

    //http://localhost:8083/tpGestiondesResevation/retrieve-all-Resevations
    @Operation(description = "récupérer toutes les Resevations  de la base de données")
    @GetMapping("/retrieve-all-Resevations")
    public List<Reservation> retrieveAllResevations() {
        List<Reservation> reservationList = reservationService.retrieveAllResevations();
        return reservationList;
    }

    //http://localhost:8083/tpGestiondesReservation/retrieve-Reservations/8
    @Operation(description = "retrive le Reservation   de la base de données")
    @GetMapping("/retrive-Reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long chId /*,@PathVariable another variable*/){
        Reservation reservation= reservationService.retrieveResevation(chId);
        return reservation;
    }

    //http://localhost:8083/tpGestiondesReservation/Reservation/add-Reservation
    @Operation(description = "ajouter le Reservation   de la base de données")
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addResevation(r);
        return reservation;
    }

    //http://localhost:8083/tpGestiondesReservation/remove-Reservations/8
    @Operation(description = "supprimer le Reservation   de la base de données")
    @DeleteMapping("/remove-Reservation/{Reservation-id}")
    public void Removereservation(@PathVariable ("reservation-id") Long chId /*,@PathVariable another variable*/){
        reservationService.removeResevation(chId);
    }

    //http://localhost:8083/tpGestiondesReservation/retrieve-all-Reservations
    @Operation(description = "modifier le reservation de la base de données")
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.modifyResevation(r);
        return reservation;
    }
}
