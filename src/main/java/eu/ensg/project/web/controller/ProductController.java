package eu.ensg.project.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.ensg.project.dao.ProductDao;
import eu.ensg.project.model.Product;

/**
 * Rest controller handling the HTTP requests relative to Product objects
 * 
 * @author Hugo De Paulis
 *
 */
@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    /**
     * Redirect the user to a web page with all the products in the database in a JSON file
     * 
     * @return List of all the products saved in a database
     */
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product>listeProduits() {
        return productDao.findAll();
    }

    /**
     * Redirect the user to a web page with the product with the given ID in a JSON file
     * 
     * @param id ID of the wanted object
     * @return Product with the given ID
     */
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }

}