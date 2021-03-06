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
//import com.example.demo.model.Freelance;
//import com.example.demo.service.FreelanceService;
//
//@RestController
//@RequestMapping("/v1/freelancers")
//public class FreelanceControllerV1 {
//
//	@Autowired
//	FreelanceService freeService;
//	
//	@PostMapping("/adicionar")
//	public void adicionar(@RequestBody Freelance free) {
//		freeService.save(free);
//	}
//	
//	@GetMapping("/buscar")
//	public ArrayList<Freelance> findAllFree(){
//		return freeService.findAll();
//	}
//	
//	@DeleteMapping("/{Cpf}")
//	public void deletar(@PathVariable Integer cpf) {
//		freeService.delete(cpf);
//	}
//	
//	@PutMapping("/editar")
//	public ResponseEntity atualizar(@RequestBody Freelance free) {
//		freeService.update(free);
//		return ResponseEntity.ok().build();
//	}
//	
//}
