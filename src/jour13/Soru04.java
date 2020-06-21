package jour13;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {


//Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın. Ornegin;
//Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz giriniz");
		String str =scan.nextLine();
		
	    int str1=str.length()/2;
		System.out.println(str.substring(0, str1));
		
		scan.close();
	}

}
