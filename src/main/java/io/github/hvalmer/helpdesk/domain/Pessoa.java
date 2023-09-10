package io.github.hvalmer.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //PK da tabela pessoa
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String nome;

    @CPF
    @Column(name = "cpf", length = 11, unique = true)//atributo único, ñ havendo igual
    protected String cpf;

    @Column(name = "email", length = 50, unique = true)//atributo único, ñ havendo igual
    protected String email;

    protected String senha;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERFIS")
    protected Set<Integer> perfis = new HashSet<>();

    @JsonFormat(pattern = "dd/MM/yy")
    protected LocalDate dataCriacao = LocalDate.now();
}
