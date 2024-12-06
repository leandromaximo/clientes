package io.github.leandromaximo.clientes.repository;

import io.github.leandromaximo.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
