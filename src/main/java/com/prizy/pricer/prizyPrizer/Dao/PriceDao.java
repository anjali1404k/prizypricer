package com.prizy.pricer.prizyPrizer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.prizy.pricer.prizyPrizer.model.Prices;

@Repository
public class PriceDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Prices> fetchPrices(){
		Query query = entityManager.createQuery("from prices", Prices.class);
		return query.getResultList();
	}
	
	public void addPrice(Prices price) {
		 entityManager.persist(price);
	}
	
	public double highestPrice(String product) {
			
		Query q = entityManager.createQuery("select price FROM prices p where p.product=:product ORDER BY price DESC LIMIT 1");
		q.setParameter("product", product);
		return (double) q.getSingleResult();
	}
	
	public double lowestPrice(String product) {
		Query q = entityManager.createQuery("select price FROM prices p where p.product=:product ORDER BY price ASC LIMIT 1");
		q.setParameter("product", product);
		return (double) q.getSingleResult();
	}
	
	public Long count(String product) {
		Query q = entityManager.createQuery("select count(*) FROM prices p where p.product=:product");
		q.setParameter("product", product);
		return (Long)q.getSingleResult();
	}
}
