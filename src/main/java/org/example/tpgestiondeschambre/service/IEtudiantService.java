package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Etudiant;
import org.example.tpgestiondeschambre.entities.Chambre;
import org.example.tpgestiondeschambre.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
