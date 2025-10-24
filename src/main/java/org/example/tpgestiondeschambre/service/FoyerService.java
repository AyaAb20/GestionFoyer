package org.example.tpgestiondeschambre.service;
import org.example.tpgestiondeschambre.entities.Foyer;

import org.example.tpgestiondeschambre.repositories.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoyerService implements IFoyerService {
    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long foyerId) {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public void removeFoyer(Long foyerId) {

    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return null;
    }


}
