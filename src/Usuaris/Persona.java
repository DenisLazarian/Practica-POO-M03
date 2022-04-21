package Usuaris;

public abstract class Persona {
	
	String nom;
	String cognom;
	int edad;
	
	
	
	Persona(){
		
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getCognom() {
		return cognom;
	}



	public void setCognom(String cognom) {
		this.cognom = cognom;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edad=" + edad + "]";
	}
	
}
