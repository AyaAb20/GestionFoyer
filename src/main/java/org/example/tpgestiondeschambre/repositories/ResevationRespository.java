package org.example.tpgestiondeschambre.repositories;

import org.example.tpgestiondeschambre.entities.Reservation;
import org.example.tpgestiondeschambre.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResevationRespository extends JpaRepository <Reservation,Long> {
}
