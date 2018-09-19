import java.util.ArrayList;
public class Continent {
	private String nom;
	private ArrayList <Pays> listPays;
	
	public void ajouterPays(Pays unNom){
		this.listPays.add(unNom);
	}
	
	public Continent(){	
		this.listPays=new ArrayList <Pays>();
	}
	public Continent(String unNom){	
		this.nom=unNom;
		this.listPays=new ArrayList <Pays>();
	}
	private String upper1(){
		String upper;
		upper=nom.substring(0,1).toUpperCase()+nom.substring(1);
		return upper;
	}
	public String toString(){
		int i=0;
		int taille=listPays.size();
		String mot="------Continent------ \n nom: "+upper1()+"\n";
		while(i<taille){
			mot+=this.listPays.get(i).toString();
			i=i+1;
		}
		return mot;
	}
}
