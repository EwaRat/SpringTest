package pl.bolka.aleksander.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.repository.IUserRepository;

@Service
public class UserService implements IUserService {

  private final IUserRepository userRepository;

  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUserById(long id) {
    return userRepository.getUserById(id);
  }

  @PostConstruct
  public void init() {
    User user = new User();
    user.setFirstName("Jan");
    user.setLastName("Kowalski");
    userRepository.save(user);
  }
}
