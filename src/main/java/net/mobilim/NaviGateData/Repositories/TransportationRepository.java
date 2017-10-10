package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface TransportationRepository extends JpaRepository<Transportation, Integer> {

}
