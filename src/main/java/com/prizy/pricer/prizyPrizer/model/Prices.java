package com.prizy.pricer.prizyPrizer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="prices")
public class Prices {

	@Column(name="user_id")
	private String userId;
	
	@Column(name="product_bar_code")
	private Long barCode;
	
	@Column(name="product")
	private String product;
	
	@Column(name="price")
	private double price;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

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
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
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
	
	
}
