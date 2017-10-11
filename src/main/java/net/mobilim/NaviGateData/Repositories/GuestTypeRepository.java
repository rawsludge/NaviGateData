package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.GuestType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface GuestTypeRepository extends JpaRepository<GuestType, Integer> {
}
