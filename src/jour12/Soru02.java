package jour12;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


		//Sorular ... Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden
		//başlayıp bitiş değerinde  biten tüm tamsayıları while loop kullanarak ekrana yazdırınız
	
		     Scanner scan = new Scanner(System.in);
			
			System.out.println("Başlangıç değerlerini giriniz");
			int num1 =scan.nextInt();
			System.out.println("Bitis değerlerini giriniz");
			int num2 =scan.nextInt();
			
			if(num1>=num2) {
				System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");}
				while(num1<=num2) {
					System.out.print(num1+" ");
					num1++;

			}
			
			{
				
				
			}
					
	
	
	scan.close();
	
	}

}
