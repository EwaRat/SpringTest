package pl.bolka.aleksander.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

  private final IUserService userService;

  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public User getUser(@PathVariable String id){
    return userService.getUserById(Long.parseLong(id));
  }

}
