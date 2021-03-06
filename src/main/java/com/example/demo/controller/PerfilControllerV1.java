package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Perfil;
import com.example.demo.model.Usuario;
import com.example.demo.service.PerfilService;

@RestController
@RequestMapping("/v1/perfil")
public class PerfilControllerV1 {

	@Autowired
	PerfilService perfService;
	
	@PostMapping("/adicionar")
	public void adicionar(@RequestBody Perfil perfil) {
		perfService.save(perfil);
	}
	
	@GetMapping("/buscar")
	public ArrayList<Perfil> findAllEnterprise(){
		return perfService.findAll();
	}
	
	@DeleteMapping("/{idPerfil}")
	public void deletar(@PathVariable Integer idPerfil) {
		perfService.delete(idPerfil);
	}
	
	@PutMapping("/editar")
	public ResponseEntity atualizar(@RequestBody Perfil perfil) {
		perfService.update(perfil);
		return ResponseEntity.ok().build();
	}
}
