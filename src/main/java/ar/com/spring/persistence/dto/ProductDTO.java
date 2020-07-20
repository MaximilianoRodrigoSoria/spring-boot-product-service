package ar.com.spring.persistence.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreType;




public class ProductDTO {

	private long id;
	private String name;
	private Double price;
	private Date cretateAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Date getCretateAt() {
		return cretateAt;
	}
	public void setCretateAt(Date cretateAt) {
		this.cretateAt = cretateAt;
	}
	
	 public ProductDTO() {}

	    private ProductDTO(Builder builder){
	    	setId(builder.id);
	    	setCretateAt(builder.cretateAt);
	    	setName(builder.name);
	    	setPrice(builder.price);
	    }
	
	 public static Builder newBuilder() {
	        return new Builder();
	    }

	    @JsonIgnoreType
	    public static final class Builder{

	    	private long id;
	    	private String name;
	    	private Double price;
	    	private Date cretateAt;

	        public Builder withId(Long id) {
	        	this.id = id;
	        	return this;
	        } 	
	        public Builder withName(String name)
	        	{this.name=name;
	        	return this;}
	        
	        public Builder withPrice(Double price)
	        	{this.price = price;
	        	return this;}
	        
	        public Builder withCreateAt(Date date)
	        	{this.cretateAt=date;
	        	return this;}
	        
	        
	    }
}
