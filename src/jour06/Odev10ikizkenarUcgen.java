package jour06;

import java.util.Scanner;

public class Odev10ikizkenarUcgen {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın. 
		//Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”  yazdırın.
		//Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		

         Scanner scan = new Scanner(System.in);
		  System.out.println("Birinci kenar uzunlugunu giriniz");
		  
		  double num1= scan.nextDouble();
		  
          System.out.println("Ikinci kenar uzunlugunu giriniz");
		  
          double num2= scan.nextDouble();
		  
          System.out.println("Ucuncu kenar uzunlugunu giriniz");
		  
          double num3= scan.nextDouble();

		  if((num1==num2)&& (num1==num3)&&(num2==num3)) {
			  
			  System.out.println("Eskenar ucgen");
			   
			  
	}  else  if((num1==num2)||(num1==num3)||(num2==num3)) {
		System.out.println("Ikizkenar ucgen");
	} else {System.out.println("Cesitkenar ucgen");


	}}}









