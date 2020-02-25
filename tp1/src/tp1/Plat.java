package tp1;

public class Plat {

	private float coutPlats;
	private String nomPlats;
	
	public Plat(String nom, float cout) {
		
		nomPlats = nom;
		coutPlats = cout;
	}
	
	public void setCoutPlats(float cout) {
		
		coutPlats = cout;

	}
	
	public float getCoutPlats() {
		
		return coutPlats;
		
	}
	
	public void setNomPlats(String nom) {
		
		nomPlats = nom;
		
	}
	
	public String getNomPlats() {
		
		return nomPlats;
		
	}
	
}
