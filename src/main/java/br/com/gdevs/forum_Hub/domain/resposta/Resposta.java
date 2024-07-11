package br.com.gdevs.forum_Hub.domain.resposta;


import br.com.gdevs.forum_Hub.domain.topico.Topico;
import br.com.gdevs.forum_Hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id")
    private Topico topico;

    private LocalDateTime data;

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private Usuario usuario;

    public Resposta(Topico topico, Usuario usuario, DadosCriacaoResposta dados){
        this.mensagem = dados.mensagem();
        this.topico = topico;
        this.data = dados.data();
        this.usuario = usuario;

    }


}
