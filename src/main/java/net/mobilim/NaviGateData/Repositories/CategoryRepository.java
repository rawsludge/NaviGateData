package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
