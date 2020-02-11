package tp1;

public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int expTravail;
	private String competence;
	private String attCour;
	
	public CV(String nom, String prenom, int expTravail, String formation, String attCour, String competence) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.expTravail = expTravail;
		this.competence = competence;
		this.attCour = attCour;
		this.formation = formation;
		
	}
	
	public static void affiche(CV cv) {
		
		System.out.println("Nom: " + cv.nom + ".");
		System.out.println("Pr�nom: " + cv.prenom + ".");
		System.out.println("Formation: " + cv.formation + ".");
		System.out.println("Comp�tence: " + cv.competence + ".");
		System.out.println("Exp�rience de travail: " + cv.expTravail + " ann�e(s).");
		System.out.println("Attente au cour: " + cv.attCour + ".");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez Barette!");
		CV cv = new CV("Tekle","Nathan",5, "Programmeur","Je n'ai pas d'attente", "Je suis comp�tent");
		affiche(cv);
		
	}

}