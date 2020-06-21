package jour15;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {


		//Kullanıcıdan isim ve soyismini alın. 
		//Kullanıcının isim ve soyisminin ilk harflerini büyük
		//diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi yaziniz: ");
		String ad=scan.nextLine();
		System.out.println("Soyadinizi yaziniz: ");
		String soyad=scan.nextLine();
		
		
		
		kimlik(ad,soyad);   // cagirici 
				
		
		scan.close();
	}
	
	public static void kimlik(String ad, String soyad) {
		
		
		System.out.println(ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1)+" "+
				soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1));

	
	
}}
