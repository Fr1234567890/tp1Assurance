package tp1;


public class Facture {
	
	private String nomClient;
	private float prix;
	private double coutTotal;
	private int nbreCommande;
	
	public Facture(String nomClient, float prix, int nbreCommande) {
		
		this.nomClient = nomClient;
		this.prix = prix;
		this.nbreCommande = nbreCommande;
		coutTotal = prix * nbreCommande;
		
	}
	
	public String getNomClient() {
		
		return nomClient;
		
	}
	
	public Double getCoutTotal() {
		
		return coutTotal;
		
	}

}
