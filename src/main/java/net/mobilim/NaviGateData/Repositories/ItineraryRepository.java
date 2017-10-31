package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Itinerary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ItineraryRepository extends PagingAndSortingRepository<Itinerary, Integer> {

    @Query("SELECT it FROM Itinerary it WHERE it.code = :code")
    Itinerary findByCode(@Param("code") String code);

    @Query( value =
            "SELECT it FROM Itinerary it " +
                "JOIN FETCH it.products p " +
            "WHERE " +
                    "p.sailingDate BETWEEN :fromDate AND :toDate " +
                    "AND p.duration BETWEEN :minDuration AND :maxDuration " +
                    "AND p.ship.code LIKE  :shipCode " +
                    "AND p.destination.code LIKE :destCode " +
            "ORDER BY p.sailingDate ASC",
    countQuery =
            "SELECT COUNT(it) FROM Itinerary it " +
                    "JOIN it.products p " +
            "WHERE " +
                    "p.sailingDate BETWEEN :fromDate AND :toDate " +
                    "AND p.duration BETWEEN :minDuration AND :maxDuration " +
                    "AND p.ship.code LIKE  :shipCode " +
                    "AND p.destination.code LIKE :destCode " +
            "ORDER BY p.sailingDate ASC")
    Page<Itinerary> findByProducts( @Param("fromDate") Date fromDate,
                                    @Param("toDate") Date toDate,
                                    @Param("minDuration") Integer minDuration,
                                    @Param("maxDuration") Integer maxDuration,
                                    @Param("shipCode") String shipCode,
                                    @Param("destCode") String destCode, Pageable pageable);
}
