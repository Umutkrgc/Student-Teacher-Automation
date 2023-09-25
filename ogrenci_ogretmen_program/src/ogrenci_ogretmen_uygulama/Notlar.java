package ogrenci_ogretmen_uygulama;
import java.util.Scanner;

public class Notlar {
	public static void main(String[] args) {
		
		 
		Scanner reader = new Scanner(System.in);
		int vizeNot,finalNot;
		double ortalama,odevNot;
		String durum="";
		System.out.println("Vize Notunuzu Girin : ");
		vizeNot=reader.nextInt();
		System.out.println("Final Notunuzu Girin : ");
		finalNot=reader.nextInt();
		System.out.println("Odev Notunuzu Girin : ");
		odevNot=reader.nextDouble();
		ortalama=vizeNot*0.3+finalNot*0.5+odevNot*0.2;
		if(ortalama>=40 && finalNot>=40) {
			durum="Geçti";
		}
		else {
			durum="Kaldý";
		}
		System.out.println("Ortalama : " + ortalama);
		
		System.out.println("Durumunuz : " + durum);
		reader.close();
	}

}

