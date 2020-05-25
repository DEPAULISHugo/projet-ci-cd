package eu.ensg.product.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.ensg.project.model.Product;

public class ProductTest {
	
	Product product = new Product(4, new String("Ecran 4K"), 1500);
	
	@Test
	public void testGetId() {
		assertEquals(4, product.getId());
		assertEquals(4,5);
	}
	
	@Test
	public void testGetNom() {
		assertEquals(new String("Ecran 4K"), product.getNom());
	}
	
	@Test
	public void testGetPrix() {
		assertEquals(1500, product.getPrix());
	}
	
	@Test
	public void testSetId() {
		product.setId(5);
		assertEquals(5, product.getId());
	}
	
	@Test
	public void testSetNom() {
		product.setNom(new String("Tablette Sony"));
		assertEquals(new String("Tablette Sony"), product.getNom());
	}
	
	@Test
	public void testSetPrix() {
		product.setPrix(400);
		assertEquals(400, product.getPrix());
	}
	
	@Test
	public void testToString() {
		assertEquals("Product{id=4, nom='Ecran 4K', prix=1500}", product.toString());
	}
	
}
