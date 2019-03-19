package com.prizy.pricer.prizyPrizer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizy.pricer.prizyPrizer.Dao.ProductDao;
import com.prizy.pricer.prizyPrizer.model.Product;
import com.prizy.pricer.prizyPrizer.service.IproductService;

@Service
public class ProductService implements IproductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> fetchAll() {
		return productDao.fetchProducts();
	}

}
