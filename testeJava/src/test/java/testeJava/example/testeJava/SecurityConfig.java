package testeJava.example.testeJava;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private HttpSecurity http;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ((Object) http
            .csrf()).disable()
            .authorizeRequests()
            .antMatchers("/api/users/register").permitAll()
            .anyRequest().authenticated()
            .and()
            .httpBasic();
    }

    // Configuração adicional para autenticação
}

