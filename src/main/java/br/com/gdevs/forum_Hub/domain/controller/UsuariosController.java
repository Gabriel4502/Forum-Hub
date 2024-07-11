package br.com.gdevs.forum_Hub.domain.controller;

import br.com.gdevs.forum_Hub.domain.usuario.DadosDetalhamentoUsuario;
import br.com.gdevs.forum_Hub.domain.usuario.Usuario;
import br.com.gdevs.forum_Hub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuarioRepository repository;

    @GetMapping
    public ResponseEntity listarUsuarios(){
        List<DadosDetalhamentoUsuario> usuarios = repository.findAll()
                .stream().map(user -> new DadosDetalhamentoUsuario(user))
                .collect(Collectors.toList());

        return ResponseEntity.ok(usuarios);
    }


}
