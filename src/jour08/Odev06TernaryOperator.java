package jour08;

import java.util.Scanner;

public class Odev06TernaryOperator {

	public static void main(String[] args) {


		//6.Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” 
		//degilse ekrana “Artık yıl degil” yazdırın.
		
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Lutfen yili giriniz");
			
			int yil = scan.nextInt();
			
			String result = yil%400==0 && yil%100==0 ? "Artik yil" : yil%4==0 ?  "Artik yil" :"Artik yil degil";

			
			System.out.println(result);
			
			
			scan.close();
	}

}
