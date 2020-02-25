package tp1;

public class Commande {

	private  String nomPlats;
	private  String nomClient;
	private  int nbreCommande;

	
	public Commande( String nomCl, String nomPl, int nbreCmd) {
		
		nomPlats = nomPl;
		nomClient = nomCl;
		nbreCommande = nbreCmd;
		
	}
	
	public void setNomPlats(String nom) {
		
		nomPlats = nom;
		
	}
	
	public String getNomPlats() {
		
		return nomPlats;
		
	}
	
	public void setNomClients(String nom) {
		
		nomClient = nom;
		
	}
	
	public String getNomClient() {
		
		return nomClient;
		
	}
	
	public void setNbreCommande(int nbre) {
		
		nbreCommande = nbre;
		
	}
	
	public int getNbreCommande() {
		
		return nbreCommande;
		
	}
	
}
