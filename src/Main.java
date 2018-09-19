
public class Main {
	public static void main(String[] args) {
		Continent unContinent = new Continent("amérique") ;
		Pays unPays = new Pays("France","francais","euro") ;
		Capitale uneCapitale = new Capitale("Paris",1000,100) ;
		Ville uneVille = new Ville("marseil",100,57,unPays) ;
		Pays unAutrePays = new Pays("EU","anglais","dollars") ;
		unPays.setCapitale(uneCapitale);
		unContinent.ajouterPays(unPays);
		System.out.println(unContinent.toString());
		//System.out.println(unPays.rechercherVille("marseil"));
	}
}
