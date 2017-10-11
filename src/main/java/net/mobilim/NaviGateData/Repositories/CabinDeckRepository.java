package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.CabinDeck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CabinDeckRepository extends JpaRepository<CabinDeck, Integer> {

    @Query("SELECT cd FROM CabinDeck cd WHERE cd.code = :code")
    CabinDeck findByCode(@Param("code") String code);
}
