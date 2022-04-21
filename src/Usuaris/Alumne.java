package Usuaris;

import modulsUFs.UF;

public class Alumne extends Persona{
	
	public int numUFs;
	UF[] arrUFsMatriculades;
	
	public Alumne(String nom, String cognom, int edad) {
		
		
		
		super.nom=nom;
		super.cognom=nom;
		super.edad=edad;
		
		arrUFsMatriculades=new UF[20];
		numUFs=0;
		
		
	}
	
	public void matricular(UF Moduls) {
		
		arrUFsMatriculades[numUFs]=Moduls;
		numUFs++;
		
		
	}
}
