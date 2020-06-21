package jour14;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın 
		//ve başlangıç değerinden başlayıp bitiş değerinde  biten
		//4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Başlangıç değerlerini giriniz");
		int bas =scan.nextInt();
		System.out.println("Bitis değerlerini giriniz");
		int son =scan.nextInt();

		int num=bas;
		
		do {
			if(num%12==0) {
				System.out.println(num);
			}
			num++;
			
		}while(num<son);
		scan.close();
	}

}
