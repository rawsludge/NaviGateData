package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.GuestType;
import net.mobilim.NaviGateData.Entities.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TransportationRepository extends JpaRepository<Transportation, Integer> {

}
