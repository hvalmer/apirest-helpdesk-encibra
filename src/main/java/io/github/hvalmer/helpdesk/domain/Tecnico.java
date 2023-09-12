package io.github.hvalmer.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.hvalmer.helpdesk.domain.enums.Perfil;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter@Setter
@Entity//cria uma tabela com o nome Tecnico
public class Tecnico extends Pessoa {
    private static final long serialVersionUID = 1L;

    @JsonIgnore//protegendo a aplicação contra serialização
    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfil(Perfil.TECNICO);
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO);
    }


}
