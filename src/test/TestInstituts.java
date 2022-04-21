package test;

import Usuaris.Alumne;
import Usuaris.Docent;
import modulsUFs.Modul;
import modulsUFs.UF;

public class TestInstituts {

public static void main(String[] args) {
		
		Modul M1= new Modul("M1-Sistemes Informatics");
		Modul M2= new Modul("M2-Bases de dades");
		Modul M3= new Modul("M3-Programaci�");
		Modul M4= new Modul("M4-Llenguatges de marques");
		
		
		System.out.println("Creant els m�duls:");
		System.out.println(M1);
        System.out.println(M2);
        System.out.println(M3);
        System.out.println(M4);
		
        System.out.println("\nAfegint UFs dins els m�duls:");
        // Afegint UFs al M�dul M1
		UF M1UF1 = new UF(M1,1,"UF1-Instala�laci� configuraci� i explotaci� del sistema inform�tic",49);
		UF M1UF2 = new UF(M1,2,"UF2-Gesti� de la informaci� i recursos en una xarxa",69);
        UF M1UF3 = new UF(M1,3,"UF3-Implantaci� de programari espec�fic",14);
        System.out.println("\n"+M1);
        
        // Afegint UFs al M�dul M2
        UF M2UF1 = new UF(M2,1,"UF1-Introducci� a les bases de dades",33);
        UF M2UF2 = new UF(M2,2,"UF2-Llenguatges SQL: DML i DDL",99);
        UF M2UF3 = new UF(M2,3,"UF3-Llenguatge SQL: DCL i extensi� procedimental",66);
        System.out.println("\n"+M2);
        
        // Afegint UFs al M�dul M3
        UF M3UF1 = new UF(M3,1,"UF1-Programaci� estructurada",74);
        UF M3UF2 = new UF(M3,2,"UF2-Disseny modular",39);
        UF M3UF3 = new UF(M3,3,"UF3-Fonaments de gesti� de fitxers",19);
        UF M3UF4 = new UF(M3,4,"UF4-Programaci� orientada a objectes.Fonaments",24);
        UF M3UF5 = new UF(M3,5,"UF5-POO. Llibreries de classes fonamentals",57);
        UF M3UF6 = new UF(M3,6,"UF6-Introducci� a la persist�ncia en BD",18);
        System.out.println("\n"+M3);
        
        Alumne a1 = new Alumne("Gerad","Lopez Bach", 18);
        a1.matricular(M1UF1);
        a1.matricular(M1UF2);
        a1.matricular(M2UF1);
        a1.matricular(M2UF2);
        
        System.out.println("\n"+a1);
        
        Alumne a2 = new Alumne("Laura","Marc Bel", 18);
        a2.matricular(M3UF1);
        a2.matricular(M3UF2);
        a2.matricular(M3UF3);
        a2.matricular(M1UF1);
        a2.matricular(M1UF2);
        
        System.out.println(a2); 
        
        Docent d1 = new Docent("Genis","Costafreda",35);
        d1.impartir(M1);
        d1.impartir(M2);
        
        System.out.println(d1);
        
        Docent d2 = new Docent("Marta","Sans Riba", 44);
        d2.impartir(M2);
        d2.impartir(M3);
        System.out.println(d2);   
	}

}
