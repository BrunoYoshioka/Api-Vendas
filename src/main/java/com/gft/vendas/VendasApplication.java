package com.gft.vendas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gft.vendas.models.Cliente;
import com.gft.vendas.repository.ClienteRepository;

@SpringBootApplication
public class VendasApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente(null,"Fulano de Tal", "457903847-32", "43489284-8", "3748824892", "18040180", "Rua sem fim", "Não interessa", "(15)984474828", "(15)984474828", "teste@rmail.com", "452", "Sorocaba", "SP");
		Cliente cli2 = new Cliente(null,"cilano de Tal", "437903843-32", "23489284-6", "3748824892", "18040180", "Rua sem fim", "Não interessa", "(15)984474828", "(15)984474828", "teste@rmail.com", "452", "Sorocaba", "SP");
		
		
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
	}
	


}
