package kosesorulari;

public class Soru02 {

	public static void main(String[] args) {
		// Bir Sayıyı ters çeviren bir uygulama yaz.

		int num = 123;
		
		int bir = num%10;
		int on = num/10%10;
		int yuz = num/100;

		System.out.println(bir+""+on+""+yuz);
			
		//2.yol
		
		  String str = String.valueOf(num);
			
		for (int i = str.length()-1; i >=0 ;i--) {
			System.out.print(str.charAt(i));
		}
		
		}
	}


