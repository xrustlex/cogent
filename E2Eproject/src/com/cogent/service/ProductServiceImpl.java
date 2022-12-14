
package com.cogent.service;

import java.util.List;

import com.cogent.bean.ProductBean;
import com.cogent.repo.ProductRepo;
import com.cogent.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {

	ProductRepo productrepo  = new ProductRepoImpl();
	@Override
	public void addProduct(ProductBean product) {
		productrepo.addProduct(product);
	}

	@Override
	public void deleteById(long id) {
		productrepo.deleteById(id);
	}

	@Override
	public void deleteByCat(String cat) {
		productrepo.deleteByCat(cat);
	}

	@Override
	public ProductBean findProductById(long id) {
		return productrepo.findProductById(id);
	}

	@Override
	public List<ProductBean> findCheapestInCat(String cat) {
		return productrepo.findCheapestInCat(cat);
	}

	@Override
	public List<ProductBean> findProductsByCat(String cat) {
		return productrepo.findProductsByCat(cat);
	}

	@Override
	public void updateProduct(ProductBean product) {
		productrepo.updateProduct(product);
	}

	@Override
	public List<ProductBean> findExpiredProducts() {
		return productrepo.findExpiredProducts();
	}

}
