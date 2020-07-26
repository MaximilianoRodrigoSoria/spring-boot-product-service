package ar.com.spring.persistence.repository.impl;

import ar.com.spring.persistence.dto.CustomProductDTO;
import ar.com.spring.persistence.repository.CustomProductRepository;

public class CustomRepositoryImp implements CustomProductRepository {
    @Override
    public CustomProductDTO findByIdDTO(Long id) {
        return null;
    }
}
