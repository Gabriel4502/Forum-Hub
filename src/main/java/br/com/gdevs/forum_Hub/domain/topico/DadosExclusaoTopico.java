package br.com.gdevs.forum_Hub.domain.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosExclusaoTopico (@NotNull Long id, @NotBlank @Valid String email, String senha) {
}
