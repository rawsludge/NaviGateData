package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
