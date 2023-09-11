package io.github.hvalmer.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.hvalmer.helpdesk.domain.enums.Prioridade;
import io.github.hvalmer.helpdesk.domain.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity//cria uma tabela com o nome Chamado
public class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id//PK da tabela chamado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFechamento;

    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
