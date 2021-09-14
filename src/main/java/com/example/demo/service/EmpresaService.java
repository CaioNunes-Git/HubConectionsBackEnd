//package com.example.demo.service;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Empresa;
//import com.example.demo.repository.EmpresaRepository;
//
//@Service
//public class EmpresaService {
//
//	@Autowired
//	EmpresaRepository empresaRepository;
//	
//	public ArrayList<Empresa> findAll(){
//		ArrayList<Empresa> listaRetorno = new ArrayList<Empresa>();
//			
//		listaRetorno = (ArrayList<Empresa>) empresaRepository.findAll();
//
//		return listaRetorno;
//	}
//	
//	public void delete(Integer cnpj) {
//		empresaRepository.deleteById(cnpj);
//	}
//	
//	public void save(Empresa empresa) {
//		empresaRepository.save(empresa);
//	}
//	
//	public void update(Empresa empresa) {
//		empresaRepository.save(empresa);
//	}
//}
