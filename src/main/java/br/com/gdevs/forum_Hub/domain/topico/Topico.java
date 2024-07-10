package br.com.gdevs.forum_Hub.domain.topico;

import br.com.gdevs.forum_Hub.domain.curso.Curso;
import br.com.gdevs.forum_Hub.domain.resposta.Resposta;
import br.com.gdevs.forum_Hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
@Entity(name = "Topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime data;
    @Enumerated
    private Status status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="curso_id")
    private Curso curso;
    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas;







}
