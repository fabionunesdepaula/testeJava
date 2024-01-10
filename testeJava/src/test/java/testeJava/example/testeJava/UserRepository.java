package testeJava.example.testeJava;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Pode adicionar métodos personalizados aqui se necessário
}
