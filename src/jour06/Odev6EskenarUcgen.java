package jour06;

import java.util.Scanner;

public class Odev6EskenarUcgen {

	public static void main(String[] args) {

           //Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın.
		//Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		
             Scanner scan = new Scanner(System.in);
             System.out.println("Birinci kenar uzunlugunu girin");
             double num1 = scan.nextDouble();
             
             System.out.println("Ikinci kenar uzunlugunu girin");
             double num2 = scan.nextDouble();
             
             System.out.println("Ucuncu kenar uzunlugunu girin");
             double num3 = scan.nextDouble();
             
             
             if((num1==num2)&&(num1==num3)&&(num2==num3)) {
             System.out.println("Eskenar ucgen");	
             } else  {          
          
                 System.out.println("Eskenar degil");	 }
                	 
            	 
             
             }}


