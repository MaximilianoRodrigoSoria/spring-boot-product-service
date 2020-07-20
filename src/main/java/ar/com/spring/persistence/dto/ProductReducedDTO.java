package ar.com.spring.persistence.dto;

public class ProductReducedDTO {
	
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
	@Override
	public String toString() {
		return "ProudctReducedDTO [name=" + name + ", price=" + price + "]";
	}
	public ProductReducedDTO(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	

}
