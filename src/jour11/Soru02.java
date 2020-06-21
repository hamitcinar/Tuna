package jour11;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve
		//başlangıç değerinden veya sonrasından   başlayıp bitiş değerinde veya
		//öncesinde  biten tüm çift tamsayıları ekrana yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayinin baslangic degerini yaziniz");
		int bas =scan.nextInt();
		System.out.println("Lutfen sayinin bitis degerini yaziniz");
		int bit =scan.nextInt();
		if(bas%2==0) {
			for(int i=bas; i<=bit; i+=+2) {
				System.out.println(i);
			
		}
		
		}else if (bas%2==1) {
			for(int i=bas+1;i<=bit; i+=+2) {
				System.out.println(i);
			}
		}
		
scan.close();
	}

}
