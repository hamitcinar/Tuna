package jour11;

import java.util.Random;
import java.util.Scanner;

public class SoruAkifAbi {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("1 le 100 Arasinda bir tamsayi giriniz");
	    
	    int num = scan.nextInt();
			Random ran = new Random();
	     
	    int num1 = ran.nextInt(5);
	    System.out.println("Bilgisayarin sayisi: "+num1);
	    int sayi = Math.abs(num-num1);
	    if(num>100) {
	    	System.out.println("Belirtilen Aralikta Bir Sayi Giriniz");
	    }
	    else if(sayi<6&& sayi>0) {
	            System.out.println("Cok Yakin");
	     }else if (sayi<15 && sayi>5) {
	    	 System.out.println("Sicak");
	     }else if (sayi>15 && sayi<90) {
	    	System.out.println("Cok Soguk");
	     }else if (sayi>90 && sayi<99) {
	    	System.out.println("kutup"); 
	     }else {
	    	 System.out.println("Helal Sana");
	     }
	    scan.close();	
	}

}
