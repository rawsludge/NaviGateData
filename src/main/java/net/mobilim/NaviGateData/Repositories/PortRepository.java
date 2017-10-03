package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PortRepository extends JpaRepository<Port, Integer> {
    @Query("SELECT p FROM Port p WHERE p.code = :code")
    Port findByCode(@Param("code") String code);
}
