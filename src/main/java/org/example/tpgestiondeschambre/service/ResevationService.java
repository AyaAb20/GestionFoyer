package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Reservation;
import org.example.tpgestiondeschambre.repositories.ResevationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor  here or @Autowired
public class ResevationService implements IResevationService {
    @Autowired
    ResevationRespository ResevationRespository;

    @Override
    public List<Reservation> retrieveAllResevations() {
        return ResevationRespository .findAll();
    }
    @Override
    public Reservation retrieveResevation(Long resevationId) {
        return ResevationRespository .findById(resevationId).get();
    }

    @Override
    public Reservation addResevation(Reservation r) {
        return null;
    }
    @Override
    public void removeResevation(Long resevationId) {
        ResevationRespository.deleteById(resevationId);
    }

    @Override
    public Reservation modifyResevation(Reservation resevation) {
        return null;
    }
}
