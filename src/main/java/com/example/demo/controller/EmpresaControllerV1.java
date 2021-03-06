//package com.example.demo.controller;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Empresa;
//import com.example.demo.model.Freelance;
//import com.example.demo.service.EmpresaService;
//
//@RestController
//@RequestMapping("/v1/empresas")
//public class EmpresaControllerV1 {
//
//	@Autowired
//	EmpresaService empresaService;
//	
//	@PostMapping("/adicionar")
//	public void adicionar(@RequestBody Empresa empresa) {
//		empresaService.save(empresa);
//	}
//	
//	@GetMapping("/buscar")
//	public ArrayList<Empresa> findAllEnterprise(){
//		return empresaService.findAll();
//	}
//	
//	@DeleteMapping("/{Cnpj}")
//	public void deletar(@PathVariable Integer cnpj) {
//		empresaService.delete(cnpj);
//	}
//	
//	@PutMapping("/editar")
//	public ResponseEntity atualizar(@RequestBody Empresa empresa) {
//		empresaService.update(empresa);
//		return ResponseEntity.ok().build();
//	}
//	
//}
