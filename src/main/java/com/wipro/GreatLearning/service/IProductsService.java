package com.wipro.GreatLearning.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wipro.GreatLearning.dto.ProductsDTO;
import com.wipro.GreatLearning.entity.Products;

public interface IProductsService {
	
	public String addProducts(ProductsDTO productDto);
	
	public List<Products> getAllProducts();
	
	public String updateProducts(ProductsDTO productDto);
	
	public String deleteProducts(long id);
	
	public Products getProductById(long id);
	
	public void saveMultiple(MultipartFile file);

}
