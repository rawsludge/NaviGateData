package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.CabinLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CabinLocationRepository extends JpaRepository<CabinLocation, Integer> {

    @Query("SELECT cl FROM CabinLocation cl WHERE cl.code = :code")
    CabinLocation findByCode(@Param("code") String code);
}
