package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.Account;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService {

  private final IAccountRepository accountRepository;

  public AccountService(IAccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public Account getAccountByUser(User user) {
    return accountRepository.getAccountByUser(user);
  }

}
