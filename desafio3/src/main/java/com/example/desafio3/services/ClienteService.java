package com.example.desafio3.services;

import com.example.entities.Cliente;

public interface ClienteService {
	Cliente findClienteByNombreANDApellidos(String nombre, String apellidos);
	Cliente save(Cliente c);
}
