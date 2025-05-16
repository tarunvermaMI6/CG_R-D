package com.elasticsearch.demo.service;

import java.util.List;

import com.elasticsearch.demo.entity.Product;

public interface ProductService {

	void saveProduct(Product product);
	List<Product> getAllProducts();
}
