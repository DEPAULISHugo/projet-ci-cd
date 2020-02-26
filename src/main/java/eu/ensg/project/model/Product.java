package eu.ensg.project.model;

/**
 * Business class describing a product with an id, a name and a price
 * @author Hugo De Paulis
 *
 */
public class Product {
    private int id;
    private String nom;
    private int prix;
    
    /**
     * Default constuctor
     */
    public Product() {
    }

    /**
     * Constructor with all the attributes (used for tests)
     * 
     * @param id ID of the product
     * @param nom Name of the product
     * @param prix Price of the product
     */
    public Product(int id, String nom, int prix) {
        this.id=id;
        this.nom=nom;
        this.prix=;
    }
    
    /**
     * Return the ID of the product
     * 
     * @return ID of the product
     */
	public int getId() {
		return id;
	}
	
	/**
	 * Change the ID of the project with a new one
	 * 
	 * @param id New ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Return the name of the product
	 * 
	 * @return Name of the product
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Change the name of the product with a new one
	 * 
	 * @param nom Name of the product
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Return the price of the product
	 * 
	 * @return Price of the product
	 */
	public int getPrix() {
		return prix;
	}
	
	/**
	 * Change the price of the product with a new one
	 * 
	 * @param prix
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
    @Override
    /**
     * Describe the product in a String
     * 
     * @return String describing the product
     * {@inheritDoc}
     */
    public String toString(){  
        return "Product{"+
        "id=" + id + 
        ", nom='"+ nom + '\'' + 
        ", prix=" + prix+ '}';
    }
}
