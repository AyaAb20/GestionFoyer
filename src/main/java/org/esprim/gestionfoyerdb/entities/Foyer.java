package org.esprim.gestionfoyerdb.entities;

import jakarta.persistence.*;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
