package metier;

import java.sql.SQLException;


public class Book extends Produit {
	private String title;
	private String author;
	private String releaseDate;
	
	
	public Book() {
		super();
	}
	public Book(int id, String nom, float prix, int qte) {
		super(id, nom, prix, qte);
	}
	public Book(int id, String nom, float prix, int qte, String title, String author, String releaseDate) {
		super(id, nom, prix, qte);
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean equals(Object o) {
		if(o instanceof Book) {
		if(this.getId()==((Book)o).getId());
		return true ;
		}
		return false ;
	}
	@Override
	public String toString() {
		return super.toString()+"book"+" "+"name of author"+" "+this.author+" "+"la date de sortie"+" "+this.releaseDate+"/n";
		
	}
	public void affiche() {
		System.out.println(toString());
	}
	
	}


