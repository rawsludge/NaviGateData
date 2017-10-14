package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Category;
import net.mobilim.NaviGateData.Entities.GuestType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface GuestTypeRepository extends JpaRepository<GuestType, Integer> {

    @Query("SELECT gt FROM GuestType gt WHERE gt.category = :category")
    GuestType findByCategory(@Param("category")Category category);
}
