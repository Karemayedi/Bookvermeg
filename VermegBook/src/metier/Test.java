package metier;



public class Test {
	public static void main(String[] args) {
	LigneCommande l1 =new LigneCommande(new Produit(5,"karem1",10,20));
	LigneCommande l2=new LigneCommande(new Produit(10,"karem2",5,2));
	Commande c2=new Commande(10);
	c2.ajouter(l1);
	c2.ajouter(l2);
	c2.ajouter(l2);
	c2.ajouter(l1);
	c2.AfficheCommande();	
	float f=c2.TotalCommande();
	System.out.println("le total est"+" " +f);
	}
	
	

	}
