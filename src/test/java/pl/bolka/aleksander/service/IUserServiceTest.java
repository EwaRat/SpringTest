package pl.bolka.aleksander.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.repository.IUserRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IUserServiceTest {

  @Autowired
  IUserService userService;

  @Autowired
  IUserRepository userRepository;

  @Test
  public void userServiceIsInjected() {
    assertThat(userService).isNotNull();
  }

  @Test
  public void whenUserDoNotExistsMustReturnNull() {
    User userById = userService.getUserById(1);
    assertThat(userById).isNull();
  }

  @Test
  public void whenUserExistWithIdMustReturn() {

    User save = userRepository.save(new User());
    User userById = userService.getUserById(save.getId());
    assertThat(userById).isNotNull();
  }

  @Test
  public void whenUserSavedWithFieldsMustReturn() {

    User user = new User();
    user.setFirstName("Jan");
    user.setLastName("Kowalski");
    User save = userRepository.save(user);
    User userById = userService.getUserById(save.getId());
    assertThat(userById.getId()).isEqualTo(save.getId());
    assertThat(userById.getFirstName()).isEqualTo("Jan");
    assertThat(userById.getLastName()).isEqualTo("Kowalski");
  }
}
