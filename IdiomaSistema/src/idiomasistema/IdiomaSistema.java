package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println("O idioma do seu sistema é " + loc.getDisplayLanguage());
	}
	
}
