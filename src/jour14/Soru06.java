package jour14;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {


		//Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
		//“a” harfi yoksa tekrar bir String girmesini isteyi

		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("Bir string giriniz");
		do {
			
			str = scan.nextLine();
			str="a";
				System.out.println("a harfi var");
			
		}while(str!="a");
			
		System.out.println("tekrar deneyiniz");
	}

}
