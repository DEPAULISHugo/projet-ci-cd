package eu.ensg.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import eu.ensg.project.model.Product;

/**
 * Class implementing the ProductDao interface to perform Product persistence
 * (possess a static field "products" to emulate a database)
 * 
 * @author Hugo De Paulis
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	
    public static List<Product>products=new ArrayList<Product>();
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350));
        products.add(new Product(2, new String("Aspirateur Robot"), 500)); 
        products.add(new Product(3, new String("Table de Ping Pong"), 750));
    }
    
    /**
     * {@inheritDoc}
     */
	@Override
	public List<Product> findAll() {
		return products;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public Product findById(int id) {
        for (Product product : products) {  
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public Product save(Product product) {
        products.add(product);
        return product;
	}
	
	

}
