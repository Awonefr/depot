public class Ville {
	private String nom;
	private int nbHabitant;
	private int superficie;
	private Pays sonpays;
	public String getNom(){
		return this.nom;
	}
	public int getnbHabitant(){
		return this.nbHabitant;
	}
	public int getsuperficie(){
		return this.superficie;
	}
	
	public void  setnom(String unNom){
		this.nom=unNom;
	}
	public void setHabitant(int unNbHabitant){
		this.nbHabitant=unNbHabitant;
	}
	public void setsuperficie(int unSuperficie){
		this.superficie=unSuperficie;
	}
	public Pays getsonpays(){
		return this.sonpays;
	}
	public void setsonpays(Pays unpays){
		this.sonpays=unpays;
	}
	public Ville(){	
	}
	public Ville(String unNom,int unNbHabitant,int uneSuperficie,Pays unpays){	
		this.nom=unNom;
		this.nbHabitant=unNbHabitant;
		this.superficie=uneSuperficie;
		this.sonpays=unpays;
		this.sonpays.ajouterVille(this);
	}
	public String toString(){
		String mot="-------------Ville-------------\n"+"nom de ville: "+nom+"\n";
		mot+="nb Habitant: "+nbHabitant+"\n";
		mot+="superficie: "+superficie+" metre carrer \n";
		return mot;
	}
}
