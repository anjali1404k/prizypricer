package com.prizy.pricer.prizyPrizer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.prizy.pricer.prizyPrizer.model.Product;


@Repository
public class ProductDao {
	
	@PersistenceContext
	private EntityManager entityManager; 
	
	public static final String FIND_ALL_PRODUCTS="findAllProducts";
	
	@SuppressWarnings("unchecked")
	public List<Product> fetchProducts() {
		Query q = entityManager.createNamedQuery(FIND_ALL_PRODUCTS);
		return q.getResultList();
	}

}
