package ar.com.spring.persistence.repository;

import ar.com.spring.persistence.dto.CustomProductDTO;

public interface CustomProductRepository {
	
	
	public CustomProductDTO findByIdDTO(Long id);

}
