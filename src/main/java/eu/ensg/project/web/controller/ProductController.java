package eu.ensg.project.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@RequestMapping(value="/Produits", method=RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }
	
	@GetMapping(value = "/Produits/{id}")
	public String afficherUnProduit(@PathVariable int id) {
		return "Vous avez demandé un produit avec l'id  " + id;
	}

}