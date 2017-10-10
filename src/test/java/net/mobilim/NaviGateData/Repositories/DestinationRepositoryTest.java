package net.mobilim.NaviGateData.Repositories;

import net.mobilim.NaviGateData.Entities.Destination;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@DataJpaTest
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@EntityScan("net.mobilim.NaviGateData.Entities")
@SpringBootTest(classes = {DestinationRepositoryTest.class})
public class DestinationRepositoryTest {

    @Autowired
    private DestinationRepository destinationRepository;

    @Test
    public void findByCodeTest() throws Exception {
        Date date = new Date();
        destinationRepository.save(new Destination("DFB", "DEFAULT"));
        Destination destination = destinationRepository.findByCode("DFB");
        assertTrue(destination.getCode().equals("DFB"));
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