package jour06;

import java.util.Scanner;

public class Odev12Milenyum {

	public static void main(String[] args) {


		//Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın. 
		//Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın. Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yili giriniz");
		
		long yil = scan.nextLong();
		
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}
		else if(yil%100==0) {
			System.out.println("Yuzyil");
		}
		else if (yil%10==0) {
			System.out.println("Onyil");
		}
		else System.out.println("Artik yil");
		
		scan.close();
	}

       }