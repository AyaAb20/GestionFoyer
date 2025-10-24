package org.esprim.gestionfoyerdb.entities;

import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Etudient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudient;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;
}
