package com.br.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> { 
	
	@Query("select obj from Sale obj where obj.date between :min and :max order by obj.amount desc")
	Page<Sale> findSales(LocalDate min, LocalDate max,Pageable pageable);

}
