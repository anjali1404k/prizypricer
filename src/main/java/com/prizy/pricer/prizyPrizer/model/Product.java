package com.prizy.pricer.prizyPrizer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Product")
@NamedQuery(
		name = "fetchAllProducts",
		query = "from Product p"
		
		)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "barCode")
	private Long barCode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ideal_price")
	private double price;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "barCode")
	private ProductDetails details;
	

	/**
	 * @return the barCode
	 */
	public Long getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(Long barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the details
	 */
	public ProductDetails getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(ProductDetails details) {
		this.details = details;
	}
	
	
	
}
