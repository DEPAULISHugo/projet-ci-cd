package eu.ensg.project.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import eu.ensg.project.model.Product;

@SpringBootTest
public class ProductDaoImplTests {
	
	@Autowired
    private ProductDaoImpl productDao;
	
	@Test
	public void testFindAll(){
		List<Product> products = productDao.products;
		assertEquals(products.size(), productDao.findAll().size());
		for (int i = 0; i < products.size(); i++) {
			assertEquals(products.get(i), productDao.findAll().get(i));
		}
	}
	
	@Test
	public void testFindById() {
		Product product = productDao.findById(1);
		assertEquals(1, product.getId());
	}
	
	@Test 
	public void testSave() {
		Product product = new Product(4, new String("Ecran 4K"), 1500);
		productDao.save(product);
		assert(productDao.products.contains(product));
	}
	

}
