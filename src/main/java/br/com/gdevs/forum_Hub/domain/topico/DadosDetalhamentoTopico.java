package br.com.gdevs.forum_Hub.domain.topico;

import br.com.gdevs.forum_Hub.domain.curso.Curso;
import br.com.gdevs.forum_Hub.domain.curso.DadosDetalhamentoCurso;
import br.com.gdevs.forum_Hub.domain.resposta.Resposta;
import br.com.gdevs.forum_Hub.domain.usuario.DadosDetalhamentoUsuario;

import java.time.OffsetDateTime;
import java.util.List;

public record DadosDetalhamentoTopico (Long id, String titulo, String mensagem, OffsetDateTime data, Status status,
                                       DadosDetalhamentoUsuario autor, DadosDetalhamentoCurso curso, List<Resposta> respostas) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getStatus(),new DadosDetalhamentoUsuario(topico.getUsuario()), new DadosDetalhamentoCurso(topico.getCurso()), topico.getRespostas() );
    }

}
