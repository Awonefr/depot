import java.util.ArrayList;

public class Pays {
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapital;
	private ArrayList <Ville> listVille;
	private static int compteurPays=0;
	/**
	 * @return retourner le nom*/
	public String getnom(){
		return this.nom;
	}
	public Capitale getCapital(){
		return this.saCapital;
	}
	public void setCapitale(Capitale uneCapitale){
		this.saCapital=uneCapitale;
	}
	public void ajouterVille(Ville unNom){
		this.listVille.add(unNom);
	}
	public boolean rechercherVille(String unNom){
		int i=0;
		int taille=listVille.size();
		boolean trouver=false;
		while(i<taille && listVille.get(i).getNom()!=unNom){
			i=i+1;
		}
		if(i<taille){
			trouver=true;
		}
		return trouver;
	}
	/**
	 *@return retourner le nom*/
	public static int getCompteurPays(){
		return compteurPays;
	}
	public void setnom(String unNom){
		this.nom=unNom;
	}
	public Pays(){	
		this.listVille=new ArrayList <Ville>();
	}
	public Pays(String unNom,String uneLangue,String uneMonnaie){
		this.nom=unNom;
		this.langue=uneLangue;
		this.monnaie=uneMonnaie;
		this.saCapital= new Capitale();
		this.listVille=new ArrayList <Ville>();
		compteurPays=compteurPays+1;
	}
	/**
	 * @return retourner le nom en majuscule*/
	public String upper(){
		String upper;
		upper=nom.toUpperCase();
		return upper;
	}
	/**
	 * @return retourner le nom avec la premier lettre en majuscule*/
	private String upper1(){
		String upper;
		upper=nom.substring(0,1).toUpperCase()+nom.substring(1);
		return upper;
	}
	/**
	 * @return retourner le nom avec la premier lettre en majuscule + le constructeur*/
	public String toString(){
		int i=0;
		int taille=listVille.size();
		String mot="-----------pays------ \n nom : "+upper1()+"\n";
		mot+="langue : "+langue+"\n";
		mot+="monnaie : "+monnaie+"\n";
		mot+=saCapital.toString();
		while(i<taille){
			mot+=this.listVille.get(i).toString();
			i=i+1;
		}
		return mot;
	}
}
