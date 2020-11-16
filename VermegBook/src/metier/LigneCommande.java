package metier;


public class LigneCommande {
	public Produit p;
	LigneCommande(Produit p){
		this.p = p;	
	}
	public Produit getProduit() {
		return p;
	}
	public void setProduit(Produit produit) {
		this.p = p;
	}
	public void AfficheLigneCommande() {
System.out.println("le prix est" +" "+p.getPrix());
System.out.println("la quantité est"+" "+p.getQte());
}
	
}
