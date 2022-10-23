/**
 * 
 */
package com.cogent.repo;

import java.util.*;

import com.cogent.bean.ProductBean;

/**
 * @author dick
 *
 * 14 окт. 2022 г.
 */
public interface ProductRepo {

	public void addProduct(ProductBean product);
	public void deleteById(long id);
	public void deleteByCat(String cat);	
	
	public ProductBean findProductById(long id);
	public List<ProductBean> findCheapestInCat(String cat);
	public List<ProductBean> findProductsByCat(String cat);
	
	public void updateProduct(ProductBean product);
	public List<ProductBean> findExpiredProducts();
	
}
