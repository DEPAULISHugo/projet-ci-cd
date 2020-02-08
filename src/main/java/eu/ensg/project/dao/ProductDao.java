package eu.ensg.project.dao;

import java.util.List;

import eu.ensg.project.model.Product;


/**
 * Interface that defines CRUD operations on objects of type Product
 * 
 * @author Hugo De Paulis
 *
 */
public interface ProductDao {
	
	/**
	 * Return the list of all products in the database
	 * 
	 * @return List of all products in the database
	 */
	public List<Product> findAll();
	
	/**
	 * Return the object with a specific id
	 * 
	 * @param id ID of the wanted product
	 * @return Product with the given ID
	 */
    public Product findById(int id);
    
    /**
     * Save a product in the database
     * 
     * @param product Product to save
     * @return Saved product
     */
    public Product save(Product product);

}
