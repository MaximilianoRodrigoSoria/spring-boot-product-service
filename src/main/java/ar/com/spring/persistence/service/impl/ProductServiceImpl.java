package ar.com.spring.persistence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.spring.persistence.entity.Product;
import ar.com.spring.persistence.repository.IProductDao;
import ar.com.spring.persistence.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDao productDao; 
	
	@Override
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Product findById(Long id) throws Exception {
		
		
		return productDao.findById(id).orElse(new Product());
	}

	@Override
	@Transactional
	public Product save(Product product) {
		
		return productDao.save(product);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		if(productDao.existsById(id))
		{
			productDao.deleteById(id);
		}
		
	}
	

}
