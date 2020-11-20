package pl.bolka.aleksander.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolka.aleksander.model.User;

public interface IUserRepository  extends JpaRepository<User, Long> {

  User getUserById(long id);

}
