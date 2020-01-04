package eu.ensg.project.dao;

import java.util.List;

import eu.ensg.project.model.Product;

public interface ProductDao {
	
	public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);

}
