package com.prizy.pricer.prizyPrizer.service;

import java.util.List;

import com.prizy.pricer.prizyPrizer.model.Prices;

public interface IpriceService {

	public List<Prices> fetchAllPrices();
	
	public void addPrice();
}
