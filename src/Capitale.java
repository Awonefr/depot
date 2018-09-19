
public class Capitale extends Ville{
	private String nom;
	private int nbHabitant;
	private int superficie;
	
	public String getnom(){
		return this.nom;
	}
	public int nbHabitant(){
		return this.nbHabitant;
	}
	public int superficie(){
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
	public Capitale(){	
	}
	public Capitale(String unNom,int unNbHabitant,int uneSuperficie){	
		this.nom=unNom;
		this.nbHabitant=unNbHabitant;
		this.superficie=uneSuperficie;
	}
	public String toString(){
		String mot="-------------capitale-------------\n"+"nom de ville: "+nom+"\n";
		mot+="nb Habitant: "+nbHabitant+"\n";
		mot+="superficie: "+superficie+" metre carrer \n";;
		return mot;
	}
}
