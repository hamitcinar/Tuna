package jour06;

import java.util.Scanner;

public class Odev3SayilarinIsareti {

	public static void main(String[] args) {


		//Kullanıcıdan iki sayı alın eğer sayıların işaretleri  aynı ise ekrana “Aynı işaretli” yazdırın.
		//Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		double num1 = scan.nextDouble();
					
		System.out.println("Lutfen bir sayi giriniz");
		
		double num2 = scan.nextDouble();
		
		if(num1<=0&&num2<=0) {
			System.out.println("Ayni isaretli");		}
		if(num1>=0&&num2>=0) {
			System.out.println("Ayni isaretli");}
				
		if(num1<0&&num2>=0) {
			System.out.println("Farkli isaretli");}
				
		if(num1>=0&&num2<0) {
			System.out.println("Farkli isaretli");}
		scan.close();
	}
		
			
		
			}


		
