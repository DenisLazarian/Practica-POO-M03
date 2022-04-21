package Usuaris;

import modulsUFs.Modul;

public class Docent extends Persona {
	
	public int numModuls;
	Modul[] modulsImpartits;
	
	public Docent(String nom, String cognom, int edad) {
		super.nom=nom;
		super.cognom=cognom;
		super.edad=edad;
		
		modulsImpartits = new Modul[3];
		numModuls=0;
	}


	

	public void impartir(Modul m) {
		
		modulsImpartits[numModuls]=m;
		numModuls++;
		
	}
	
	@Override
	public String toString() {
		
		String cadena= "\n";
		for(int i =0; i < numModuls; i++)
			cadena+= modulsImpartits[i].getNomModul()+"\n";
		
		
		return "Docent "+nom+" "+cognom+" imparteix: "+ cadena;
	}

}
