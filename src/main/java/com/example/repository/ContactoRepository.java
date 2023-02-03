package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Contacto;
import com.example.model.Usuario;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer>{

}
