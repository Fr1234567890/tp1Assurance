package tp1;

public class Facture {
	
	private String nomClient;
	private float prix;
	private int nbrePlat;
	private double coutTotal;
	
	public Facture(String nom, float prix, int nbre){
		
		nomClient = nom;
		this.prix = prix;
		nbrePlat = nbre;
		
	}
	
	public String getNomClient() {
		
		return nomClient;
		
	}
	
	public double getCoutTotal() {
		
		return coutTotal;
		
	}
	
	public void calculeCoutTotal() {
		
		coutTotal = nbrePlat * prix;
		
	}
	
	public float getPrix() {
		
		return prix;
		
	}
	

}
