package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contacto;
import com.example.repository.ContactoRepository;

@RestController
@RequestMapping("/contactos")
public class ContactoController {

	private final ContactoRepository contactoRepository;
	
	public ContactoController(ContactoRepository contactoRepository) {
		this.contactoRepository = contactoRepository;
	}
	
	@PostMapping
	public Contacto guardar(@RequestBody Contacto contacto) {
		return contactoRepository.save(contacto);
	}
	
	@GetMapping
	public List<Contacto> listarContacto() {
		return contactoRepository.findAll();

	}
	}