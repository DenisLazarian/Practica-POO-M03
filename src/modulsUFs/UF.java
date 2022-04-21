package modulsUFs;

public class UF {
	
	private Modul refModul;
	
	private String nom;
	private int durada;

	
	

	public UF(Modul m1, int posicio, String nom, int durada) {
		
		
		
		
		this.nom=nom;
		this.durada=durada;
		this.refModul = m1;
		this.refModul.horesTotals+= durada;
		this.refModul.getArrUFs()[posicio-1] = this;
		
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDurada() {
		return durada;
	}


	public void setDurada(int durada) {
		this.durada = durada;
	}
	@Override
	public String toString() {
		return refModul.nomModul.substring(0, 2)+ nom + " ("+ durada+ " hores) ";
	}

}
