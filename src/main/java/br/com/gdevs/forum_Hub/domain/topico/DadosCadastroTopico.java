package br.com.gdevs.forum_Hub.domain.topico;

import br.com.gdevs.forum_Hub.domain.usuario.Usuario;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotNull
        @Future
        LocalDateTime data,
        @NotNull
        Status status,
        @NotNull
        Long usuario_id



) {
}
