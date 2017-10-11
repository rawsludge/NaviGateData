package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {

    @Query("SELECT d FROM Destination d WHERE d.code = :code")
    Destination findByCode(@Param("code") String code);

    default Destination checkAndSave(String code, String name) {
        Destination destination = findByCode(code);
        if( destination== null ) {
            destination = save(new Destination(code, name));
        }
        return destination;
    }
}
