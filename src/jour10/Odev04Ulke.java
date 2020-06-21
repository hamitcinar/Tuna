package jour10;

import java.util.Scanner;

public class Odev04Ulke {

	public static void main(String[] args) {


		//4.  Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA,
		//Ingiltere ise ekrana UK,
		//Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ülkenin ismini giriniz");
		 
		String ulke = scan.next();
		
		ulke.trim();
		
	    ulke=ulke.toLowerCase(); 
	
		 switch(ulke) {
		
		      case "amerika":
		    	  System.out.println("USA");
		    	  break;
		    	  
		      case "ingiltere":
		    	  System.out.println("UK");
		    	  break;	  
		    	  
		      case "almanya":
		    	  System.out.println("DE");
		    	  break;	 
		    	  
		    default:
		    System.out.println("NA");
		    
		    scan.close();
		}
		
		
		

	}

}
