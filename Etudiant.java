package model;

public class Etudiant {

	
	//attributs
	private String nom;
	private int age;
	private double moyenne;
	private String adresse;
	//methods 
	public void info(){
		System.out.println(nom);
		System.out.println(age);
		System.out.println(moyenne);
		System.out.println(adresse);
	}
	//constructeur par defaut
	public Etudiant() {}
	//constructeur avec paramètres
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		setNom(nom);
	    setAge(age);
	    setMoyenne(moyenne);
		this.adresse = adresse;
	}
	//Getter and Setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		if (nom !=null && nom.length()>=8 && nom.length()<=30) 
		{
		this.nom = nom;
		}
		else {
            System.out.println("Erreur : Le nom doit contenir entre 8 et 30 caractères.");
        }
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18 && age<=28) 
		{
			this.age = age;
	     } 
		else {
	            System.out.println("Erreur : L'âge doit être entre 18 et 28.");
	        }
		}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		if (moyenne>0 && moyenne<20)
		{
			this.moyenne = moyenne;
		}
		else {
            System.out.println("Erreur : La moyenne doit être entre 0 et 20.");
        }
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}

