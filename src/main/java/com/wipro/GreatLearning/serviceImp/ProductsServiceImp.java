package com.wipro.GreatLearning.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.GreatLearning.dto.ProductsDTO;
import com.wipro.GreatLearning.entity.Products;
import com.wipro.GreatLearning.helper.Helper;
import com.wipro.GreatLearning.repository.ProductsRepository;
import com.wipro.GreatLearning.service.IProductsService;

@Service
public class ProductsServiceImp implements IProductsService {
	
	@Autowired
	private ProductsRepository repo;

	@Override
	public String addProducts(ProductsDTO productDto) {
		// TODO Auto-generated method stub
		Products products=new Products();
		products.setName(productDto.getName());
		products.setPrice(productDto.getPrice());
		products.setUrl(productDto.getUrl());
		products.setQuantity(productDto.getQuantity());
		products.setCatagory(productDto.getCatagory());
		repo.save(products);
		
		
		return "New Product Is Saved";
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String updateProducts(ProductsDTO productDto) {
		// TODO Auto-generated method stub
		Products products=new Products();
		products.setId(productDto.getId());
		products.setName(productDto.getName());
		products.setPrice(productDto.getPrice());
		products.setUrl(productDto.getUrl());
		products.setQuantity(productDto.getQuantity());
		products.setCatagory(productDto.getCatagory());
		repo.save(products);
		return "Product is Updated";
	}

	@Override
	public String deleteProducts(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Product is Deleted";
	}

	@Override
	public Products getProductById(long id) {
		return repo.findById(id).get();
		
	}

	@Override
	public void saveMultiple(MultipartFile file) {
		// TODO Auto-generated method stub
		try {
		List<Products> products= Helper.convertExcelToListOfProducts(file.getInputStream());
		this.repo.saveAll(products);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
