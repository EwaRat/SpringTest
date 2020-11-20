package pl.bolka.aleksander.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolka.aleksander.model.Account;
import pl.bolka.aleksander.model.User;

public interface IAccountRepository  extends JpaRepository<Account, Long> {

  Account getAccountByUser(User user);

  Account getAccountById(long id);

}
