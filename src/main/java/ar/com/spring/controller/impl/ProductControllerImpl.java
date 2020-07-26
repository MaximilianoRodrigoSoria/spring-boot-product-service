package ar.com.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.spring.controller.ProductController;
import ar.com.spring.persistence.dto.CustomProductDTO;
import ar.com.spring.persistence.entity.Product;
import ar.com.spring.persistence.repository.ProductRepository;
import ar.com.spring.persistence.service.ProductService;

@RefreshScope
@RestController
@RequestMapping("/product")
public class ProductControllerImpl implements ProductController{


	private ProductService productService;



	@Value("${echo.test.message}")
	private String echoTestMessage;

	@GetMapping("/find-all")
	public ResponseEntity<List<Product>> findAll()
		{
		productService.findByIdDTO(1L);
		return new ResponseEntity<List<Product>>( productService.findAll(), HttpStatus.OK);}
	
	
	@GetMapping("/find-by-id-dto/{id}")
	public ResponseEntity<CustomProductDTO> findByIdCustomDTO(@PathVariable Long id) throws Exception
		{
		return new ResponseEntity<CustomProductDTO>( productService.findByIdDTO(id), HttpStatus.OK);}
	
	
	
	@GetMapping("/find-by-id/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) throws Exception
		{return new ResponseEntity<Product>( productService.findById(id), HttpStatus.OK);}


	@PostMapping("/save")
	public ResponseEntity<Product> save(@RequestBody Product product) throws Exception
		{return new ResponseEntity<Product>( productService.save(product), HttpStatus.CREATED);}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> edit(@RequestBody Product product, @PathVariable Long id) throws Exception
	{	
		Product productDb = productService.findById(id);
		productDb.setCretateAt(product.getCretateAt());
		productDb.setName(product.getName());
		productDb.setPrice(product.getPrice());
		return new ResponseEntity<Product>( productService.save(productDb), HttpStatus.OK);}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Exception
	{
		productService.deleteById(id);
		return new ResponseEntity<String>("Delete successfully!!!", HttpStatus.NO_CONTENT);
	}

	@Override
	@GetMapping("/echo")
	public String echo() throws Exception {
		return echoTestMessage.toUpperCase();
	}




	@Autowired
	public void setProductService(ProductService productService){
		this.productService = productService;
	}
}
