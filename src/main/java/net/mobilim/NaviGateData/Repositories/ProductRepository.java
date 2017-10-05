package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.sailingDate BETWEEN :fromDate AND :toDate")
    Product findBySailingDate(Date fromDate, Date toDate);

    @Query("SELECT p FROM Product p WHERE p.sailingID = :sailingID")
    Product findBySailingID(@Param("sailingID") String sailingID);
}
