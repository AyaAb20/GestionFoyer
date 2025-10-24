package org.example.tpgestiondeschambre.repositories;

import org.example.tpgestiondeschambre.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepsoitory extends JpaRepository<Chambre,Long> {
}
