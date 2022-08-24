package com.wipro.GreatLearning.service;

import java.util.List;

import com.wipro.GreatLearning.entity.Products;

public interface IProductsService {
	
	public String addProducts(Products productDto);
	
	public List<Products> getAllProducts();

}
