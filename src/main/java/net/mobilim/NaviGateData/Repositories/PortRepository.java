package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PortRepository extends JpaRepository<Port, Integer> {
    @Query("SELECT p FROM Port p WHERE p.code = :code")
    Port findByCode(@Param("code") String code);

    default Port checkAndSave(String code, String name) {
        Port port = findByCode(code);
        if( port== null ) {
            port = save(new Port(code, name));
        }
        return port;
    }
}
