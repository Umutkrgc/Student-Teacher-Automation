package ogrenci_ogretmen_uygulama;

public enum Yil {
	ILK_YIL(0), IKINCI_YIL(1), UCUNCU_YIL(2), SON_YIL(3);

	private static int numara;

	public int getNumara() {
		return numara;
	}

	public static void setYil(int Numara) {
		numara = Numara;
	}
	
	public static String getYil(int Numara) {
		switch (Numara) {
		case 1:
			return "ILK_YIL";
		case 2:
			return "IKINCI_YIL";
		case 3:
			return "UCUNCU_YIL";
		case 4:
			return "SON_YIL";
		default:
			return null;
		}
	}

	private Yil(int numara) {
		setYil(numara);
	}
}
