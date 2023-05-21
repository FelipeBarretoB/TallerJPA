package co.com.icesi.demojpa.controller;

import antlr.Token;
import co.com.icesi.demojpa.dto.LoginDTO;
import co.com.icesi.demojpa.dto.TokenDTO;
import co.com.icesi.demojpa.servicio.TokenSercive;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthController {
    private final TokenSercive tokenSercive;

    private final AuthenticationManager authenticationManager;

    @PostMapping("/token")
    public TokenDTO token(@RequestBody LoginDTO loginDTO) {
        return tokenSercive.logIn(loginDTO);
    }
}
