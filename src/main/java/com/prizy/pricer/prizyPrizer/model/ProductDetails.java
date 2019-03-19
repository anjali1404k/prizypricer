package com.prizy.pricer.prizyPrizer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Product_details")
@NamedQueries({
    @NamedQuery(
        name = "findProductDetails",
        query = "from productDetails p where p.productName=:productName"
        )
})
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bar_code")
	private Long barCode;
	
	@Column(name="product_description")
	private String productDescription;
	
	@Column(name="average_price")
	private double averagePrice;
	
	@Column(name="lowest_price")
	private double lowestPrice;
	@Column(name="highest_price")
	private double highestPrice;
	@Column(name="ideal_price")
	private double idealPrice;
	@Column(name="no_of_prices")
	private Long noOfPrices;
	
	@Column(name="other_info")
	private String otherInfo;

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
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the averagePrice
	 */
	public double getAveragePrice() {
		return averagePrice;
	}

	/**
	 * @param averagePrice the averagePrice to set
	 */
	public void setAveragePrice(double averagePrice) {
		this.averagePrice = averagePrice;
	}

	/**
	 * @return the lowestPrice
	 */
	public double getLowestPrice() {
		return lowestPrice;
	}

	/**
	 * @param lowestPrice the lowestPrice to set
	 */
	public void setLowestPrice(double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	/**
	 * @return the highestPrice
	 */
	public double getHighestPrice() {
		return highestPrice;
	}

	/**
	 * @param highestPrice the highestPrice to set
	 */
	public void setHighestPrice(double highestPrice) {
		this.highestPrice = highestPrice;
	}

	/**
	 * @return the idealPrice
	 */
	public double getIdealPrice() {
		return idealPrice;
	}

	/**
	 * @param idealPrice the idealPrice to set
	 */
	public void setIdealPrice(double idealPrice) {
		this.idealPrice = idealPrice;
	}

	/**
	 * @return the noOfPrices
	 */
	public Long getNoOfPrices() {
		return noOfPrices;
	}

	/**
	 * @param noOfPrices the noOfPrices to set
	 */
	public void setNoOfPrices(Long noOfPrices) {
		this.noOfPrices = noOfPrices;
	}

	/**
	 * @return the otherInfo
	 */
	public String getOtherInfo() {
		return otherInfo;
	}

	/**
	 * @param otherInfo the otherInfo to set
	 */
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	
}
