package ar.com.spring.persistence.service.impl;

import java.util.List;

import ar.com.spring.persistence.dto.CustomProductDTO;
import ar.com.spring.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.spring.persistence.entity.Product;
import ar.com.spring.persistence.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Product findById(Long id) throws Exception {
		
		
		return productRepository.findById(id).orElse(new Product());
	}

	@Override
	@Transactional
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		if(productRepository.existsById(id))
		{
			productRepository.deleteById(id);
		}
		
	}

	@Override
	public CustomProductDTO findByIdDTO(Long id) {
		return productRepository.findByIdDTO(id);
	}

	@Autowired
	public void setProductRepository(ProductRepository productRepository){
		this.productRepository = productRepository;
	}

}
