package ogrenci_ogretmen_uygulama;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramInterface {
	LinkedList<ogrenci> ogrenciListesi;
	static Scanner in = new Scanner(System.in);

	public ProgramInterface() {
		this.ogrenciListesi = new LinkedList<ogrenci>();
	}

	public void ShowTeacherMenu() {
		System.out.println("\t\t--Menu--");
		System.out.println("\t(1) -> Ogrenci Ekle");
		System.out.println("\t(2) -> Ogrenci Sil");
		System.out.println("\t(3) -> Tum Ogrencileri Goster");
		System.out.println("\t(4) -> Ara");
		System.out.println("\t(5) -> Cýkýs");
		int secenek = in.nextInt();
		switch (secenek) {
		case 1:
			this.ogrenciEkle();
			break;
		case 2:
			this.ogrenciSil();
			break;
		case 3:
			this.ogrencileriGoster();
			break;
		case 4:
			System.out.println("-----------");
			System.out.println("Öðrenci id'sini girin : ");
			in.nextLine();
			String id = in.next();
			this.ogrenciAra(id);
			break;
		case 5:
		default:
			this.showMainMenu();
		}
	}

	public void showMainMenu() {
		clearConsole();
		System.out.println("KÝM KULLANIYOR");

		int choice;

		System.out.println("=========================");
		System.out.println("\t (1) Ogretmen");
		System.out.println("\t (2) Ogrenci");
		choice = in.nextInt();
		System.out.println("=========================");
		switch (choice) {
		case 1:
			this.ShowTeacherMenu();
			break;
		case 2:
			this.showStudentMenu();
			break;
		case 3:
		default:
			break;

		}

	}

	public final static void clearConsole() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}

	public void ogrenciEkle() {
		System.out.println("=========================");
		System.out.println("Brans -> { 1 : \"BILGISAYAR\", 2 : \"MIMARLIK\", 3 : \"MAKINE\"}");
		System.out.println("Yýl -> { 1 : \"ILK_YIL\", 2 : \"IKINCI_YIL\", 3 : \"UCUNCU_YIL\", 4 : \"SON_YIL\"}");
		System.out.println("Enter\n(Isým,Brans,Yýl) -> ");
		in.nextLine();
		System.out.print("ISIM : ");
		String isim = in.nextLine();
		System.out.print("BRANS : ");
		int branch = in.nextInt();
		System.out.print("YIL : ");
		int cls = in.nextInt();
		ogrenciListesi.add(new ogrenci(isim, branch, cls));
	}

	public void ogrenciSil() {
		System.out.println("=========================");
		System.out.println("Silmek istedginiz ogrencinin id'sini giriniz :");
		in.nextLine();
		String id = in.next();
		int a = this.ogrenciAra(id);
		if (a != -1) {
			this.ogrenciListesi.remove(a);
		} else
			System.out.println("Ogrenci id" + id + "bulunamadý..");
	}

	public void ogrencileriGoster() {
		System.out.println("=========================");
		for (ogrenci Ogrenci : this.ogrenciListesi) {
			System.out.println("-----");
			System.out.println(Ogrenci);
		}
	}

	public int ogrenciAra(String id) {
		for (int i = 0; i < this.ogrenciListesi.size(); ++i) {
			if (id.equals(this.ogrenciListesi.get(i).Numara))
				return i;
		}
		return -1;
	}

	public void odevEkle() {

	}

	public void showStudentMenu() {
		System.out.println("\t\t--Menu--");
		System.out.println("\t(1) -> Odev Ekle");
		System.out.println("\t(2) -> Notlarýný Hesapla");
		System.out.println("\t(3) -> Kredi Ekle");
		System.out.println("\t(4) -> Cýkýs");
		int secenek = in.nextInt();
		switch (secenek) {
		case 1:
			this.odevEkle();
			break;
		case 2:
			this.notHesapla();
			break;
		case 3:
			this.krediEkle();
			break;
		case 4:
		default:
			this.showMainMenu();
		}

	}

	private void krediEkle() {
		// TODO Auto-generated method stub

	}

	private void notHesapla() {
		// TODO Auto-generated method stub

	}
}
