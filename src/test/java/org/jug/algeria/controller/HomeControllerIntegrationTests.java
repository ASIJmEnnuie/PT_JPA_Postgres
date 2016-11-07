package org.jug.algeria.controller;

import org.fest.assertions.Assertions;
import org.jug.algeria.config.*;
import org.jug.algeria.domain.Evenement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {AppConfig.class})
@WebIntegrationTest("server.port:9000")
public class HomeControllerIntegrationTests {

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void shouldAdd_Evenement_ToDb(){
        ResponseEntity<Evenement> responseEntity = restTemplate.postForEntity("http://localhost:9000/evenement/event", MockHttpServletRequest.DEFAULT_PROTOCOL, Evenement.class);
        final Evenement eventUser = responseEntity.getBody();
        Assertions.assertThat(eventUser).isNotNull();
        Assertions.assertThat(eventUser.getNomEvt()).isNotNull().isEqualTo("event");
    }
}
