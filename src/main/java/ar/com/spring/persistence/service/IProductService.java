package ar.com.spring.persistence.service;

import java.util.List;

import ar.com.spring.persistence.entity.Product;

public interface IProductService {
	
	public List<Product> findAll();
	public Product findById(Long id) throws Exception;
	public Product save(Product product);
	public void deleteById(Long id);
	
}
