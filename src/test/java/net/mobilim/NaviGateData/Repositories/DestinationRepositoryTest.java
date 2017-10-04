package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Destination;
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
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.ANY;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@SpringBootTest(classes = {DestinationRepositoryTest.class})
@AutoConfigureTestDatabase(replace = ANY)
@EntityScan("net.mobilim.NaviGateData.Entities")
public class DestinationRepositoryTest {

    @Autowired
    private DestinationRepository destinationRepository;

    @Test
    public void findByCodeTest() throws Exception {
        Date date = new Date();
        destinationRepository.save(new Destination("DFA", "DEFAULT"));
        Destination destination = destinationRepository.findByCode("DFA");
        assertTrue(destination.getCode().equals("DFA"));
        assertTrue(destination.getName().equals("DEFAULT"));
        assertThat(destination.getInsertDate(), is(date));
        assertThat(destination.getLastUpdateDate(), is(date));
    }

    @Test
    public  void  checkAndSaveTest() throws Exception {
        Destination destination= destinationRepository.checkAndSave("DFA", "DEFAULT");
        assertThat(destination.getCode(), is("DFA"));
        assertThat(destination.getName(), is("DEFAULT"));

        Destination destination1 = destinationRepository.checkAndSave("DFA", "DEF");
        assertThat(destination1.getCode(), is(destination.getCode()));
        assertThat(destination1.getName(), is(destination.getName()));
        assertThat(destination1.getId(), equalTo(destination.getId()));
    }
}