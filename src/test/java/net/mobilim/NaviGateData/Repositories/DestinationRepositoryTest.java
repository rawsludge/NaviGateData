package net.mobilim.NaviGateData.Repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import net.mobilim.NaviGateData.Entities.Destination;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.ANY;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@SpringBootTest(classes = {DestinationRepositoryTest.class})
@AutoConfigureTestDatabase(replace = ANY)
@EntityScan("net.mobilim.NaviGateData.Entities.*")
public class DestinationRepositoryTest {

    @Autowired
    private DestinationRepository destinationRepository;

    @Test
    public void findByCodeTest() throws Exception {
        destinationRepository.save(new Destination("DFA", "DEFAULT"));
        Destination destination = destinationRepository.findByCode("DFA");
        assertTrue(destination.getCode().equals("DFA"));
        assertTrue(destination.getName().equals("DEFAULT"));
    }

}