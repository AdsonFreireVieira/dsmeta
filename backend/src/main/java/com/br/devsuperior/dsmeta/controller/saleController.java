package com.br.devsuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.devsuperior.dsmeta.entities.Sale;
import com.br.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value ="/sales")
public class saleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales(){
		
		return service.findSales();
	}

}
