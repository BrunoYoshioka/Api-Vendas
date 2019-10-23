package com.gft.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gft.vendas.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
