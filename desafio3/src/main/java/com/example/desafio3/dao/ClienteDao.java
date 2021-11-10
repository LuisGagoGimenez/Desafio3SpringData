package com.example.desafio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Cliente;


public interface ClienteDao extends JpaRepository<Cliente, Long>{
	Cliente findClienteByNombreANDApellidos(String nombre, String apellidos);
}
