package org.esprim.gestionfoyerdb.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

}
