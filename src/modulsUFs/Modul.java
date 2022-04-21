package modulsUFs;

public class Modul {
	
	String nomModul;
	int horesTotals;
	
	private UF[] arrUFs;
	
	public Modul(String nomModul) {
		this.nomModul= nomModul;
		arrUFs= new UF[6];
		horesTotals = 0;
	}


	public String getNomModul() {
		return nomModul;
	}


	public void setNomModul(String nomModul) {
		this.nomModul = nomModul;
	}

	public int getHoresTotals() {
		return horesTotals;
	}


	public void setHoresTotals(int horesTotals) {
		this.horesTotals = horesTotals;
	}


	
	public UF[] getArrUFs() {
		return arrUFs;
	}


	public void setArrUFs(UF[] arrUFs) {
		this.arrUFs = arrUFs;
	}
}
