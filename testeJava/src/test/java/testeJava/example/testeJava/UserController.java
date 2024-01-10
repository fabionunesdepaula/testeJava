package testeJava.example.testeJava;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // Suponha que você tenha um serviço para lidar com operações de usuário
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        return userService.save(user);
    }
}
