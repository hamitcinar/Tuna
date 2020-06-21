package jour13;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		//bitiş değerinde biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız
		    Scanner scan = new Scanner(System.in);
			
			System.out.println("Başlangıç değerlerini giriniz");
			int bas =scan.nextInt();
			System.out.println("Bitis değerlerini giriniz");
			int son =scan.nextInt();
			
			if(bas>=son) {
				System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
			}

			int num1= bas;
		    while(num1<=son) {
		    	if(num1%15==0) {
		    		System.out.print(num1+"-");
		    	}num1++;
		    }
		
		scan.close();
	}

}
