package com.elasticsearch.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elasticsearch.demo.entity.Product;
import com.elasticsearch.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository; 
	
	@Override
	public List<Product> getAllProducts() {
		
		List<Product> productList = new ArrayList<>();
		
		productRepository.findAll().forEach(x->productList.add(x));
		
		return productList;
	}

	@Override
	public void saveProduct(Product product) {
		
		productRepository.save(product);
	}

}
