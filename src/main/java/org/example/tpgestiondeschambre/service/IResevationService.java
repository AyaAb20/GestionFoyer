package org.example.tpgestiondeschambre.service;

import org.example.tpgestiondeschambre.entities.Reservation;

import java.util.List;

public interface IResevationService {
    public List<Reservation> retrieveAllResevations();
    public Reservation retrieveResevation(Long resevationId);
    public Reservation addResevation(Reservation c);
    public void removeResevation(Long resevationId);
    public Reservation modifyResevation(Reservation resevation);
}
