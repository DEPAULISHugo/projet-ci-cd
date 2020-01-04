package eu.ensg.project.model;

public class Product {
    private int id;
    private String nom;
    private int prix;
    
    // Constructeur par défaut
    public Product() {
    }

    // Constructeur pour nos tests

    public Product(int id, String nom, int prix) {
        this.id=id;
        this.nom=nom;
        this.prix=prix;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
    @Override
    public String toString(){  
        return "Product{"+
        "id=" + id + 
        ", nom='"+ nom + '\'' + 
        ", prix=" + prix+ '}';
    }
}