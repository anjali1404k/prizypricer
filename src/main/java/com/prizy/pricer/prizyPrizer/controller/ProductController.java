/**
 * 
 */
package com.prizy.pricer.prizyPrizer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prizy.pricer.prizyPrizer.model.Product;
import com.prizy.pricer.prizyPrizer.model.ProductDetails;
import com.prizy.pricer.prizyPrizer.service.IproductService;

/**
 * @author DTLD0248
 *
 */

@RestController
@RequestMapping("/product")
public class ProductController {

	@Resource
	IproductService productService;
	
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Product>> fetchProduct(){
		return new ResponseEntity<>(productService.fetchAll(), HttpStatus.OK); 
	}

}
