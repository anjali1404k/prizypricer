package com.prizy.pricer.prizyPrizer.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.prizy.pricer.prizyPrizer.Dao.PriceDao;
import com.prizy.pricer.prizyPrizer.Dao.ProductViewerDao;
import com.prizy.pricer.prizyPrizer.model.ProductDetails;
import com.prizy.pricer.prizyPrizer.service.IProductViewerService;

@Service
public class productViewerService implements IProductViewerService {

	@Resource
	ProductViewerDao productViewerDao;
	
	@Resource
	PriceDao priceDao;
	
	@Override
	public ProductDetails fetchProductDetails(String product) {
		ProductDetails prod = productViewerDao.fetchProductDetails(product);
		double highestPrice  = priceDao.highestPrice(product);
		double lowestPrice = priceDao.lowestPrice(product);
		double price = (highestPrice+lowestPrice)/2;
		double idealPrice = price+price*0.02;
		Long count = priceDao.count(product);
		
		prod.setAveragePrice(price);
		prod.setHighestPrice(highestPrice);
		prod.setLowestPrice(lowestPrice);
		prod.setIdealPrice(idealPrice);
		prod.setNoOfPrices(count);
		
		return prod;
		
	}

}
