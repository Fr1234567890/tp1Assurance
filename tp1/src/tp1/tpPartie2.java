package tp1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class tpPartie2 {

	
	
	 
	
	    public static void main(String[] args) throws FileNotFoundException 
	    {
	    	
	        String filePath = "../format.txt";
	        String toutLeFichier = fichierAuComplet(filePath) ;
	        String lines[] = toutLeFichier.split("\\r?\\n");
	        
	        String tousLesClients[]; 
	        int posPlat = 0;
	        int posCommande = 0;
	        int posClient = 0;
	        int posFin = 0;
	        
	        ArrayList<Client> listClient = new ArrayList<Client>();
	        ArrayList<Commande> listCommande = new ArrayList<Commande>();
	        ArrayList<Plat> listPlat = new ArrayList<Plat>();
	        ArrayList<Facture>listFacture = new ArrayList<Facture>();
	        
	        for (int i = 0; i < lines.length; i++) {
	        	
	        	if ( lines[i].contains("Clients")) {
	        		
	        		posClient = i + 1;
	        		
	        	} else if ( lines[i].contains("Plats") ) {
	        		
	        		posPlat = i + 1;
	        	
	        		
	        	} else if ( lines[i].contains("Commandes")) {
	        		
	        		posCommande = i + 1;
	        		
	        	} else if ( lines[i].contains("Fin") ) {
	        		
	        		posFin = i;
	        		
	        	}
	        	
			}
	             for (int i = 0; i < lines.length; i++) {
	            	 
	            	 if ( i >= posClient && i < posPlat - 1 ) {
	            		 
	            		Client client = new Client(lines[i]);
		            	listClient.add(client);
	            		 
	            	 } else if ( i >= posPlat && i < posCommande - 1) {
	            		 
	            		 String[] mots = lines[i].split(" ");
	            		 Plat plat = new Plat(mots[0], Float.parseFloat(mots[1]));
	            		 listPlat.add(plat);
	            		 
	            	 } else if ( i >= posCommande && i < posFin) {
	            		 
	            		 String[] mots = lines[i].split(" ");
	            		 Commande commande = new Commande(mots[0],mots[1], Integer.parseInt(mots[2]));
	            		 listCommande.add(commande);
	            		 
	            	 }
					
				}
	           
	             
	             for( Commande commande : listCommande ) {
	            	 
	            	 String nomClient = commande.getNomClient();
	            	 float prix = 0;
	            	 for ( Plat plat : listPlat ) {
	            		 
	            		 if ( plat.getNomPlats().contentEquals(commande.getNomPlats()) ) {
	            			 
	            			 prix = plat.getCoutPlats();
	            			 
	            		 }
	            		 
	            	 }
	            	 
	            	 int nbreCommande = commande.getNbreCommande();
	            	 Facture facture = new Facture(nomClient, prix, nbreCommande);
	            	 listFacture.add(facture);
	            	 
	             }	             
	            
	             String premierLigne = "Bienvenue chez Barette!\nFacture:";
	             
	             System.out.println(premierLigne);
	             
	             try (
	            		 PrintStream writer = new PrintStream(new FileOutputStream("tp1Partie2.txt"))) {
	            	   
	            	 writer.println(premierLigne);
	            	    
	            	
	             for(Facture facture : listFacture) {
	            	 
	            	 String chaqueLingne = facture.getNomClient() + " " + facture.getCoutTotal();
	            	 System.out.println(chaqueLingne);
	            	 writer.println(chaqueLingne);
	             }
	             }
				}
	        
	        
	    
	 
	    public static String fichierAuComplet(String filePath) {
	    	
	        String content = "";
	 
	        try{
	        	
	            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
	            
	        } 
	        catch (IOException e) {
	        	
	            e.printStackTrace();
	            
	        }
	        
	        return content;
	        
	    }
	
}
