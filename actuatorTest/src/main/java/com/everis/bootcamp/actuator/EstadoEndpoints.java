package com.everis.bootcamp.actuator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "estados")
public class EstadoEndpoints {
	
	private List<String> lista = new ArrayList<>();
	
	@ReadOperation
	public List<String> estados(){
		return lista;
	}
	
	@WriteOperation
	public void write(@Selector String estadoNuevo) {
		lista.add(estadoNuevo);
	}
	
	@DeleteOperation
	public void delete(@Selector String estadoBorrar) {
		lista.remove(estadoBorrar);
	}

}
