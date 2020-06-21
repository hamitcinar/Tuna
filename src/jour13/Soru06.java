package jour13;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {


		//Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa 
		//“a” harfinin ilk görünümünün  indexini ekrana yazdırın.
		//“a” harfi yoksa ekrana “a harfi yok” yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String str = scan.nextLine();
		str =str.toLowerCase();//Büyük 'A' harfine de duyarli hale getirdim.
		
		if(str.contains("a")){
	    	System.out.println("'a' harfinin ilk gorunum indexi : " + str.indexOf('a'));
	    }else{
	    	System.out.println("a harfi yoktur");

	}
scan.close();
}}
