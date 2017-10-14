package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.sailingDate BETWEEN :fromDate AND :toDate")
    Product findBySailingDate(Date fromDate, Date toDate);

    @Query("SELECT p FROM Product p WHERE p.sailingID = :sailingID")
    Product findBySailingID(@Param("sailingID") String sailingID);

    @Query("SELECT p FROM Product p WHERE p.sailingDate BETWEEN :fromDate AND :toDate AND p.duration BETWEEN :minDuration AND :maxDuration AND p.ship.code LIKE  :shipCode AND p.destination.code LIKE :destCode")
    List<Product> findAvailableProducts(@Param("fromDate") Date fromDate,
                                        @Param("toDate") Date toDate,
                                        @Param("minDuration") Integer minDuration,
                                        @Param("maxDuration") Integer maxDuration,
                                        @Param("shipCode") String shipCode,
                                        @Param("destCode") String destCode);
}
