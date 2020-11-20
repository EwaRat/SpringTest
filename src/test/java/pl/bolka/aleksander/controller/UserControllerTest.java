package pl.bolka.aleksander.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.ObjectAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import pl.bolka.aleksander.model.User;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UserControllerTest {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void getUserShouldReturnValue() throws Exception {
    User user = this.restTemplate.getForObject("http://localhost:" + port + "/user/1",
        User.class);
    assertThat(user).isNotNull();
    assertThat(user.getFirstName()).isEqualTo("Jan");
    assertThat(user.getLastName()).isEqualTo("Kowalski");
  }

}
