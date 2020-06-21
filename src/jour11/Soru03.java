package jour11;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve
		//başlangıç değerinden veya sonrasından   başlayıp bitiş değerinde veya 
		//öncesinde  biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayinin baslangic degerini yaziniz");
		int bas =scan.nextInt();
		System.out.println("Lutfen sayinin bitis degerini yaziniz");
		
		int bit =scan.nextInt();
		
		if(bas%3==0) {
			for(int i=bas;i<=bit;i+=+3)
				System.out.println(i);
		}
		else if(bas%3==1) {
			for(int i=bas+2;i<=bit;i+=+3)
				System.out.println(i);
		}else {
			for(int i=bas+1;i<=bit;i+=+3)
				System.out.println(i);
		}
scan.close();
	}

}
