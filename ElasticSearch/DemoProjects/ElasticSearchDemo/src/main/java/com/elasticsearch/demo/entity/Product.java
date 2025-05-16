package com.elasticsearch.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;
import lombok.Data;

@Document(indexName = "product")
@Data
@Builder
public class Product {

	@Id
	private String id;
	private String name;
	private double price;
	private String description;
	
	
}
