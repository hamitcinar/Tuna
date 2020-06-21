package jour15;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


		//Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, 
		//birinci sayı büyük ise ekrana “Birinci sayı büyük”, 
		//ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız

		Scanner scan = new Scanner(System.in);
		System.out.println("Islem yapmak icin iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		buyukluk(num1,num2);  //cagirici
		scan.close();
	}

	public static void buyukluk( double num1, double num2) {
	
	    if(num1==num2) {
	    	System.out.println("Esittir");
	
	}else if(num1<num2) {
		System.out.println("ikinci sayi buyuktur");
	}else {
		System.out.println("Birinci sayi buyuktur ");
	}
}}
