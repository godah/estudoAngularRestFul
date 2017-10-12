package curso.angular.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import curso.angular.dao.DaoImplementacao;
import curso.angular.dao.DaoInterface;
import curso.angular.model.Cliente;

@Controller
@RequestMapping(value="/cliente")
class ClienteController extends DaoImplementacao<Cliente> implements DaoInterface<Cliente> {
	public ClienteController(Class<Cliente> persistenceClass){
		super(persistenceClass);
	}
	
	@RequestMapping(value="listar", method=RequestMethod.GET)
	@ResponseBody
	public String listar(){ 
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		
		cliente.setId(10L);
		cliente.setEndereco("Rua do cliente");
		cliente.setNome("Joaquim");
		cliente.setTelefone("31 315165161");
		
		clientes.add(cliente);
		
		cliente = new Cliente();
		
		cliente.setId(12L);
		cliente.setEndereco("Rua do cliente3");
		cliente.setNome("Ana");
		cliente.setTelefone("31 787897978");
		
		clientes.add(cliente);
		
		return new Gson().toJson(clientes);
	}
}
