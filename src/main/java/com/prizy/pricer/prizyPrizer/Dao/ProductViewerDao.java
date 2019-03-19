package com.prizy.pricer.prizyPrizer.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.prizy.pricer.prizyPrizer.model.ProductDetails;

@Repository
public class ProductViewerDao {

	@PersistenceContext
	private EntityManager entityManager; 
	public static final String FIND_PRODUCT_DETAILS="findProductDetails";
	
	public ProductDetails fetchProductDetails(String product) {
		Query query = entityManager.createNamedQuery(FIND_PRODUCT_DETAILS);
		query.setParameter("productName", product);
		return (ProductDetails) query.getSingleResult();
	}
}
