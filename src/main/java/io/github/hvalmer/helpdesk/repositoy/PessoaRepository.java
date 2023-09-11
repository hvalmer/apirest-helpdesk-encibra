package io.github.hvalmer.helpdesk.repositoy;

import io.github.hvalmer.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Optional<Pessoa> findByCPF(String cpf);
    Optional<Pessoa> findByEmail(String email);
}