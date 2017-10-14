package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Category;
import net.mobilim.NaviGateData.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT ca FROM Category ca WHERE ca.code = :cabinCode AND ca.product = :product")
    Category findByProduct(@Param("cabinCode") String code,  @Param("product") Product product);
}
