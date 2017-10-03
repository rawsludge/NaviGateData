package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ShipRepository extends JpaRepository<Ship, Integer> {
    @Query("SELECT s FROM Ship s WHERE s.code = :code")
    Ship findByCode(@Param("code") String shipCode);
}