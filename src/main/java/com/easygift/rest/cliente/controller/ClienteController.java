package com.easygift.rest.cliente.controller;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easygift.rest.cliente.domain.Cliente;
import com.easygift.rest.cliente.repository.ICliente;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	private ICliente ic;

	@GetMapping("/test")
	public String test(){
		return "test!!";
	}
	
	@PostMapping
	public Cliente addCliente(@RequestBody Cliente cl) {
		//System.out.println(cl.toString());
		Cliente cliente = new Cliente();
		List <Cliente> lCliente = ic.findByCEDULACLIENTE(cl.CEDULACLIENTE);
		try {
			if (lCliente.isEmpty()) {
				cliente = ic.save(cl);
			}else {
				cliente = lCliente.get(0);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}
}
