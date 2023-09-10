package io.github.hvalmer.helpdesk.repositoy;

import io.github.hvalmer.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
