package metier;


public class Produit {
	private int id ;
	private String nom;
	private float prix ; 
private 	int qte;

public Produit() {
	super();
}
public Produit(int id, String nom, float prix, int qte) {
	super();
	this.id = id;
	this.nom = nom;
	this.prix = prix;
	this.qte = qte;
}
	// TODO Auto-generated constructor stub

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
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public String toString() {
	return  "Id" +""+ getId() + ", Nom=" +"" + getNom() + ", le prix=" +""+ getPrix() + ", la qte="
			+""+ getQte() + "";
}
public void affiche() {
	System.out.println(toString());
}
}
