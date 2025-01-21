package com.forohub.tvs.controller;

import com.forohub.tvs.domain.usuario.DatosAutenticacionUsuario;
import com.forohub.tvs.domain.usuario.Usuario;
import com.forohub.tvs.infra.security.DatosJWTToken;
import com.forohub.tvs.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;


    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        Optional<Authentication> authenticationToken = Optional.of(new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), datosAutenticacionUsuario.clave()));
        Authentication usuarioAutenticado = authenticationManager.authenticate(authenticationToken.get());
        Optional<String> JWTtoken = usuarioAutenticado.map(usuario -> tokenService.generarToken((Usuario) usuario.getPrincipal()));

        return JWTtoken.map(ResponseEntity::ok).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
}