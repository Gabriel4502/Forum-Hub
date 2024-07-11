package br.com.gdevs.forum_Hub.domain.topico;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosExclusaoTopico (@NotNull @JsonAlias("id") Long topicoId, @NotBlank @Email String email, String senha) {
}
