package ar.com.spring.persistence.service.impl;

import org.springframework.data.jpa.repository.Query;

import ar.com.spring.persistence.dto.ProductReducedDTO;

public interface ICustomProductService{
	
	public ProductReducedDTO findByIdCustom(Long id);
	

}
