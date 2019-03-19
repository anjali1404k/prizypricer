package com.prizy.pricer.prizyPrizer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prizy.pricer.prizyPrizer.model.ProductDetails;
import com.prizy.pricer.prizyPrizer.service.IProductViewerService;


@RestController
@RequestMapping("/productViewer")
public class ProductViewerController {

	@Resource
	IProductViewerService productviewerService;
	
	
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ProductDetails> fetchProductDetails(@RequestParam String product){
		return new ResponseEntity<>(productviewerService.fetchProductDetails(product),HttpStatus.OK); 
	}
}
