package ogrenci_ogretmen_uygulama;
public enum Branch {
	BILGISAYAR(0),
	MIMARLIK(1),
	MAKINE(2);
	private int numara;
	
	public String getBranch(int numara) {
		switch (numara) {
		case 0:
			return "BILGISAYAR";
		case 1:
			return "MIMARLIK";
		case 2:
			return "MAKINE";
			default:
				return "";
		}
	}
	
	public void setBranch(int numara) {
		this.numara = numara;
	}
	
	public int getNumara() {
		return this.numara;
	}
	private Branch(int numara) {
		this.numara = numara;
	}

}
