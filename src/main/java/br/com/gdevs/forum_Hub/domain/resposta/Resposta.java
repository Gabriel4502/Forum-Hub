package br.com.gdevs.forum_Hub.domain.resposta;


import br.com.gdevs.forum_Hub.domain.topico.Topico;
import br.com.gdevs.forum_Hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "respostas")
@Entity(name = "Resposta")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topico_id")
    private Topico topico;
    private LocalDateTime data;
    @JoinColumn(name = "usuario_id")
    @OneToOne
    private Usuario autor;

}
