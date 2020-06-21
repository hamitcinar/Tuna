package jour10;

import java.util.Scanner;

public class Odev01KrediKarti {

	public static void main(String[] args) {


		//1.  Kullanıcıdan kredi kartı numarasını alın ve bu numaranın 
		//üçüncü, dördüncü ve sonuncu  rakamlarını ekrana yazdırın

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		
		String num = scan.next();
		       num.trim();
		double num1 = num.length();
		
		
		System.out.println(num.charAt(2));
		
		System.out.println(num.charAt(3));
		
		System.out.println(num.charAt((int) (num1-1)));
		
		scan.close();
		
	}	

}
