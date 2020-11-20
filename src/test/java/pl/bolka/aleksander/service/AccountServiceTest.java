package pl.bolka.aleksander.service;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.bolka.aleksander.model.Account;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.repository.IAccountRepository;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {

  IAccountService accountService;

  @Mock
  IAccountRepository accountRepository;

  @Before
  public void init() {
    accountService = new AccountService(accountRepository);
  }

  @Test
  public void getAccountByUser() {
    when(accountRepository.getAccountByUser(any())).thenReturn(new Account());
    Account accountByUser = accountService.getAccountByUser(new User());
    assertNotNull(accountByUser);

  }
}
