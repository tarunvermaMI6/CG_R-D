package com.elasticsearch.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elasticsearch.demo.entity.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String>{

}
