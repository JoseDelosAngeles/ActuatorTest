package com.everis.bootcamp.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndponitActuator {
	
	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint() {
		return new ResponseEntity<>("CustomEndpointActuator abierto", HttpStatus.OK);
	}

}
