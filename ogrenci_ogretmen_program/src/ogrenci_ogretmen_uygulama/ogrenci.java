package ogrenci_ogretmen_uygulama;
import java.util.LinkedList;
import java.util.Random;

public class ogrenci {
	static Random rand = new Random();
	String Isim;
	String Numara;
	Branch Branch;
	Yil yil;
	LinkedList<Notlar> notlari;
	
	public ogrenci(String isim2, int branch2, Object yil2) {
		// TODO Auto-generated constructor stub
	}

	public void Ogrenci(String Isim,int branchId,int yil) {
		this.Isim = Isim;
		this.Branch = ogrenci_ogretmen_uygulama.Branch.valueOf(Branch.getBranch(branchId));
		this.yil = Yil.valueOf(Yil.getYil(yil));
		this.Numara = this.Branch + Integer.toString(rand.nextInt(180));
			
	}
	
	public String getNumara() {
		return Numara;
	}
	

	public String toString() {
		return "Isim : " + this.Isim + "\tBranch : " + this.Branch + "\tNUMARA : " + this.Numara.toString();
	}

}
