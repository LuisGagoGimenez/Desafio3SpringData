package com.example.desafio3.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio3.dao.ClienteDao;
import com.example.entities.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteDao clienteDao;
	
	
	@Override
	@Transactional
	public Cliente findClienteByNombreANDApellidos(String nombre, String apellidos) {
		// TODO Auto-generated method stub
		return clienteDao.findClienteByNombreANDApellidos(nombre, apellidos);
	}


	@Override
	@Transactional
	public Cliente save(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.save(c);
	}

}
