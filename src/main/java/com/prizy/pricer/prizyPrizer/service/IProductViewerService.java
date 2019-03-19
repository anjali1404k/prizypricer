package com.prizy.pricer.prizyPrizer.service;

import com.prizy.pricer.prizyPrizer.model.ProductDetails;

public interface IProductViewerService {

	public ProductDetails fetchProductDetails(String product);
}
