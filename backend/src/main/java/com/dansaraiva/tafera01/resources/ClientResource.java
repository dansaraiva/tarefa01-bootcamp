package com.dansaraiva.tafera01.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dansaraiva.tafera01.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity <List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Daniel","00546637337",4000.00,Instant.now(),0));
		return ResponseEntity.ok().body(list);
	}
}
