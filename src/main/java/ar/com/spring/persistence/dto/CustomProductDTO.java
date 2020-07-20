package ar.com.spring.persistence.dto;

public class CustomProductDTO {
	
	private String name;
	private Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public CustomProductDTO(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	

}
