package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Universite;
import org.example.tpgestiondeschambre.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor  here or @Autowired
public class UniversiteService implements IUniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;

    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long universiteId) {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public void removeUniversite(Long universiteId) {

    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return null;
    }
}
