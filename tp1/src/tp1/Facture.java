package tp1;

public class Facture {
	
	private String nomClient;
	private float coutInit;
	private int nbrePlat;
	private double coutTotal = 0;
	
	public Facture(String nom, float coutIn, int nbre){
		
		nomClient = nom;
		coutInit = coutIn;
		nbrePlat = nbre;
		coutTotal = coutInit * nbrePlat;
		
	}
	
	public String getNomClient() {
		
		return nomClient;
		
	}
	
	public double getCoutTotal() {
		
		return coutTotal;
		
	}
	

}
