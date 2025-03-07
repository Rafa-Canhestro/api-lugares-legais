package com.lugares.legais.config.jwt;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class JwtUtils {
    
    private final JwtConfig jwtConfig;

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + jwtConfig.getExpirationTime()))
                .signWith(jwtConfig.getSecretKey())
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parserBuilder().setSigningKey(jwtConfig.getSecretKey()).build()
                .parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(jwtConfig.getSecretKey()).build().parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

}

