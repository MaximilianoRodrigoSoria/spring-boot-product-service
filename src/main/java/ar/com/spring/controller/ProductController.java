package ar.com.spring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ar.com.spring.persistence.entity.Product;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Product: ", description = "The Product API")
public interface ProductController {
	
	@ApiResponses(value= {
			  @ApiResponse(responseCode = "200", description = "Owner data getted successfully"),
			  @ApiResponse(responseCode = "400", description = "Bad Request"),
			  @ApiResponse(responseCode = "404", description = "Not Found"),
			  @ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public ResponseEntity<List<Product>> findAll();

	@ApiResponses(value= {
			  @ApiResponse(responseCode = "200", description = "Owner data getted successfully"),
			  @ApiResponse(responseCode = "400", description = "Bad Request"),
			  @ApiResponse(responseCode = "404", description = "Not Found"),
			  @ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public ResponseEntity<Product> findById(@Parameter(description="Id of the product to be find. Cannot be empty.",
            required=true) Long id) throws Exception;
	
	@ApiResponses(value= {
			  @ApiResponse(responseCode = "200", description = "Owner data getted successfully"),
			  @ApiResponse(responseCode = "400", description = "Bad Request"),
			  @ApiResponse(responseCode = "404", description = "Not Found"),
			  @ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public ResponseEntity<Product> save(@Parameter(description="Product to be save. Cannot be empty.",
            required=true) Product product) throws Exception;

	@ApiResponses(value= {
			  @ApiResponse(responseCode = "200", description = "Owner data getted successfully"),
			  @ApiResponse(responseCode = "400", description = "Bad Request"),
			  @ApiResponse(responseCode = "404", description = "Not Found"),
			  @ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public ResponseEntity<Product> edit(@Parameter(description="Product to be save. Cannot be empty.",required=true)Product product, 
										@Parameter(description="Id of the product to be find. Cannot be empty.",required=true) Long id) throws Exception;

	@ApiResponses(value= {
			  @ApiResponse(responseCode = "200", description = "Owner data getted successfully"),
			  @ApiResponse(responseCode = "400", description = "Bad Request"),
			  @ApiResponse(responseCode = "404", description = "Not Found"),
			  @ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public ResponseEntity<String> delete(@Parameter(description="Id of the product to be delete. Cannot be empty.",
            required=true) Long id) throws Exception;


	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Test OK"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error"),
	})
	public String echo() throws Exception;
}
