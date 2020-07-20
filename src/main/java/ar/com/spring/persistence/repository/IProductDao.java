package ar.com.spring.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.spring.persistence.entity.Product;

public interface IProductDao extends CrudRepository<Product, Long>{

}
