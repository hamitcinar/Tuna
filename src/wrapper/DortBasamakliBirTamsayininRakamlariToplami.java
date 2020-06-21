package wrapper;

import java.util.Scanner;

public class DortBasamakliBirTamsayininRakamlariToplami {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		
		//kullanicidan 4 basamakli tamsayi alin bu sayinin rakamlarinin toplamini bulun
		
		
		
		System.out.println("Dort basamakli bir tamsayi giriniz");
		
		
		
		
		int sayim = scan.nextInt(); //sayi= 4523
	
		int birler = sayim % 10;
		
		int vo = sayim / 10;
		int onlar = vo % 10;
		
		int vy = sayim / 100;			
		int yuzler = vy % 10;
		
		int binler = sayim / 1000;
		
		System.out.println(birler + onlar + yuzler + binler );
		
		

	}

}
