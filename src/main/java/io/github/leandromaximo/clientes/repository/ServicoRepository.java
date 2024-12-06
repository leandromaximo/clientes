package io.github.leandromaximo.clientes.repository;

import io.github.leandromaximo.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository  extends JpaRepository<Servico, Integer> {

}
