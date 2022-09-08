package com.br.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.devsuperior.dsmeta.entities.Sale;
import com.br.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {

		return	repository.findAll();
		
	}

}
