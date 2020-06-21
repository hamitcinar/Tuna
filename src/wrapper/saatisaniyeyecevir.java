package wrapper;

import java.util.Scanner;

public class saatisaniyeyecevir {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     
     System.out.println("Lutfen saati giriniz");
     
     int saat = scan.nextInt();
     
     System.out.println(saat*60*60);
     

	}

}
