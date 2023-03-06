//GUINVARC'H LEO 2A
public class Main {
	public static void main(String argv[]) {
        Pile UnePile = new Pile(10);
	        if (!UnePile.estVide()) System.out.println("OUI");

	        try {
				UnePile.empiler(5);
			} catch (Exception e) {
				
			}
	        if (UnePile.estVide()) System.out.println("OUI");

	        int element = UnePile.sommet();
	        if (!UnePile.estVide()) System.out.println("OUI");
	        // Selon l'implémentation requise dans ce TP , Sommet() ne dépile pas la Pile
	       

                // UnePile n'est pas vide
	        if (element != 5) System.out.println("OUI");
	        
	        if (!UnePile.estVide()) System.out.println(UnePile.sommet());
	        
	        
	}
}

