package com.gaap.mp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Person rest.
 */
@RestController
@RequestMapping("demo")
public class PersonRest {
    /**
     * Gets message.
     *
     * @return the message
     */
    @GetMapping("/message")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity("Esto es una prueba",HttpStatus.OK);
	}

}
