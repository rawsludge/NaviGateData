package net.mobilim.NaviGateData.Repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import net.mobilim.NaviGateData.Entities.Port;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@DataJpaTest
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@EntityScan("net.mobilim.NaviGateData.Entities")
@SpringBootTest(classes = {DestinationRepositoryTest.class})
public class PortRepositoryTest {

    @Autowired
    private PortRepository portRepository;

    @Test
    public void findByCode() throws Exception {
        Date date = new Date();
        portRepository.save(new Port("DFA", "DEFAULT"));
        Port port = portRepository.findByCode("DFA");
        assertTrue(port.getCode().equals("DFA"));
        assertTrue(port.getName().equals("DEFAULT"));
        assertThat(port.getInsertDate(), is(date));
        assertThat(port.getLastUpdateDate(), is(date));
    }
    @Test
    public  void  checkAndSaveTest() throws Exception {
        Port port = portRepository.checkAndSave("DFA", "DEFAULT");
        assertThat(port.getCode(), is("DFA"));
        assertThat(port.getName(), is("DEFAULT"));

        Port port1 = portRepository.checkAndSave("DFA", "DEF");
        assertThat(port1.getCode(), is(port.getCode()));
        assertThat(port1.getName(), is(port.getName()));
        assertThat(port1.getId(), equalTo(port.getId()));
    }
}