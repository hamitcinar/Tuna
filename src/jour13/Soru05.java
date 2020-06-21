package jour13;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {

		//Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin 
		//yerlerini değiştirerek  ekrana yazdırın. 
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String str=scan.nextLine();
		
		int length=str.length();
		char ilk=str.charAt(0);
		char son= str.charAt(length-1);
		String orta=str.substring(1, str.length()-1);
		
		System.out.println(son+orta+ilk);
		

     scan.close();  
	}

}
