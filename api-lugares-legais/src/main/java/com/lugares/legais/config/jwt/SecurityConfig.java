package com.lugares.legais.config.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.SecurityWeb;

@Configuration
public class SecurityConfig {

    //verificar como resolver o problema para localizar a dependência de security

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http.csrf(ServerHttpSecurity.CsrfSpec::disable)
            .authorizeExchange(exchanges -> exchanges
                .pathMatchers("/auth/login").permitAll() 
                .anyExchange().authenticated()
            )
            .addFilterBefore(new JwtAuthFilter(), SecurityWebFiltersOrder.AUTHENTICATION)
            .build();

        return http.build();
    }

}
