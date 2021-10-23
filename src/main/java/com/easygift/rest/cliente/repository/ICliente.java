package com.easygift.rest.cliente.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.easygift.rest.cliente.domain.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer>{
	List<Cliente> findByCEDULACLIENTE(String cEDULACLIENTE);
}
