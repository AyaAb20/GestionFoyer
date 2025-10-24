package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Etudiant;
import org.example.tpgestiondeschambre.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor  here or @Autowired
public class EtudiantService implements IEtudiantService {
    @Autowired
    EtudiantRepository EtudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return EtudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return null;
    }
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return EtudiantRepository.save(e);
    }
    @Override
    public void removeEtudiant(Long etudiantId) {
        EtudiantRepository.deleteById(etudiantId);
    }
    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return EtudiantRepository.save(etudiant);
    }
}
