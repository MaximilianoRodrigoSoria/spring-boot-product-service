package ar.com.spring.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.spring.persistence.dto.CustomProductDTO;
import ar.com.spring.persistence.entity.Product;

@Repository
public interface ProudctRepository extends JpaRepository<Product, Long>, CustomProductRepository {
	
    @Query("SELECT new ar.com.spring.persistence.dto.CustomProductDTO(p.name,p.price) "
    		+ "FROM Product p where p.id=:id")
	public CustomProductDTO findByIdDTO(Long id);


}
