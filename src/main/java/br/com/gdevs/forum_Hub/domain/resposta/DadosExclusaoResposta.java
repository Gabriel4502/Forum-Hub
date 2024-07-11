package br.com.gdevs.forum_Hub.domain.resposta;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosExclusaoResposta (
        @NotNull
        Long usuario_id,
        @NotBlank
        String email,
        @NotBlank
        String senha

) {
}
