package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Foyer;
import org.example.tpgestiondeschambre.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public  Universite retrieveUniversite(Long  universiteId);
    public  Universite addUniversite(Universite c);
    public void removeUniversite(Long universiteId);
    public  Universite modifyUniversite(Universite  universite);
}
