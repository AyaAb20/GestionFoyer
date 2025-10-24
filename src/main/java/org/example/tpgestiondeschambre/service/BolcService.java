package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Bloc;
import org.example.tpgestiondeschambre.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor  here or @Autowired
public class BolcService implements IBlocService {
    @Autowired
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return null;
    }
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }
    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }
    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
