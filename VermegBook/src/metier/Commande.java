package metier;

public class Commande {
	String nom ; 
	int id ;
	int num ;
	int maxc=2;
	int nb=0; 
	//ligneCommande c1[]=new ligneCommande[maxc];
	LigneCommande c1[];
	public Commande(int nbc) {
	c1=new LigneCommande[nbc];
	}	
	//ligneCommande c []= {new ligneCommande(new Produit(1, "karem", 10f, 1)),new ligneCommande(new Produit(2, "karem1", 20f, 3))};
	/*public Commande(int num ,String nom, int id) {
		this.nom = nom;
		this.id = id;
	}*/
	public void ajouter(LigneCommande c3) {
	/*	int i=0;
		for( i=0;i<c1.length;i++) {
			c1[i]= c3;}*/	
		if(nb<=this.c1.length) 
			c1[this.nb++]=c3;
			//nbc++;
		//}
	//	System.out.println(c1[nbc]);
	}	
public void AfficheCommande( ) {
	for(int i=0;i<nb;i++) {
		c1[i].AfficheLigneCommande();			
	}
}
public float TotalCommande() {
	float total =0;
	for(int i=0;i<nb;i++) {
		total=total+c1[i].p.getPrix()*this.c1[i].p.getQte();	
	}
	return total;	
}
}
