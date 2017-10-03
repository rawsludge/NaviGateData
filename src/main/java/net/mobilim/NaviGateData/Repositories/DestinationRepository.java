package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer> {
    @Query("SELECT d FROM Destination d WHERE d.code = :code")
    Destination findByCode(@Param("code") String code);
}
