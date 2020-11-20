package pl.bolka.aleksander.service;

import pl.bolka.aleksander.model.Account;
import pl.bolka.aleksander.model.User;

public interface IAccountService {

  Account getAccountByUser(User user);

}
