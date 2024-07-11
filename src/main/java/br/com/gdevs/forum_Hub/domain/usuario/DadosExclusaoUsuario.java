package br.com.gdevs.forum_Hub.domain.usuario;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record DadosExclusaoUsuario(@NotBlank String email, @NotBlank @Email String senha) {
}
