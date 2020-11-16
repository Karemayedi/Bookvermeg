package metier;


public class Client extends Personne  {
    private int numero;
    private String adresse ;
	public Client(int numero ,String adresse,int id, String nom, String prenom) {
		super(id, nom, prenom);
		this.numero=numero ;
		this.adresse=adresse;
		}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void afficheClient() {
		super.affichePersonne();
		System.out.println("le numero de client est "+this.numero);
		System.out.println("l'adresse du client est "+this.adresse);
		
	}

}
