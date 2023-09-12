package io.github.hvalmer.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.hvalmer.helpdesk.domain.enums.Perfil;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity//cria uma tabela com o nome Cliente
public class Cliente extends Pessoa{
    private static final long serialVersionUID = 1L;

    @JsonIgnore//protegendo a aplicação contra serialização
    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);

        addPerfil(Perfil.CLIENTE);
    }
}
