package jour29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {

	public static void main(String[] args) throws FileNotFoundException {

		// C/ Yeni dosyayi programa ekleyiniz

		FileInputStream yeni = new FileInputStream("C/");
		
		/*Exception in thread "main" java.io.FileNotFoundException: C (Le fichier spécifié est introuvable)
		at java.io.FileInputStream.open0(Native Method)
		at java.io.FileInputStream.open(Unknown Source)
		at java.io.FileInputStream.<init>(Unknown Source)
		at java.io.FileInputStream.<init>(Unknown Source)
		at jour29.Exception1.main(Exception1.java:12)*/
	}

}
