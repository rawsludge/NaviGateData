package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Ship;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.ANY;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@SpringBootTest(classes = {DestinationRepositoryTest.class})
@AutoConfigureTestDatabase(replace = ANY)
@EntityScan("net.mobilim.NaviGateData.Entities")
public class ShipRepositoryTest {
    @Autowired
    private ShipRepository shipRepository;

    @Test
    public void findByCode() throws Exception {
        Date date = new Date();
        shipRepository.save(new Ship("DFA", "DEFAULT"));
        Ship ship = shipRepository.findByCode("DFA");
        assertTrue(ship.getCode().equals("DFA"));
        assertTrue(ship.getName().equals("DEFAULT"));
        assertThat(ship.getInsertDate(), is(date));
        assertThat(ship.getLastUpdateDate(), is(date));
    }
    @Test
    public  void  checkAndSaveTest() throws Exception {
        Ship ship = shipRepository.checkAndSave("DFA", "DEFAULT");
        assertThat(ship.getCode(), is("DFA"));
        assertThat(ship.getName(), is("DEFAULT"));

        Ship ship1 = shipRepository.checkAndSave("DFA", "DEF");
        assertThat(ship1.getCode(), is(ship.getCode()));
        assertThat(ship1.getName(), is(ship.getName()));
        assertThat(ship1.getId(), equalTo(ship.getId()));
    }

}