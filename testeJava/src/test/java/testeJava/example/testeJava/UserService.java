package testeJava.example.testeJava;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    // Suponha que você tenha um repositório para interagir com o banco de dados
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        // Implemente a lógica para salvar o usuário no banco de dados
        return userRepository.save(user);
    }
}
