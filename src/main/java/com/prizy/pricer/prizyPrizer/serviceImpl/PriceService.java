package com.prizy.pricer.prizyPrizer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizy.pricer.prizyPrizer.Dao.PriceDao;
import com.prizy.pricer.prizyPrizer.model.Prices;
import com.prizy.pricer.prizyPrizer.service.IpriceService;

@Service
public class PriceService implements IpriceService{

	@Autowired
	PriceDao priceDao;
	
	@Override
	public List<Prices> fetchAllPrices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPrice() {
		// TODO Auto-generated method stub
		
	}

}
