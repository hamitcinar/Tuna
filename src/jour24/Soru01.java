package jour24;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
        long n = input.nextLong();
        System.out.println("Sayı Değerleri Toplama: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
      
       // Write your code here
      
      
     long onlar = ((n /10) % 10);
     long birler  = (n % 10);
      
      
    return (int)(birler + onlar);

     
      
    }  

	}


