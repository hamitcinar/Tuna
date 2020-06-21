package jour12;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		//bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın

Scanner scan = new Scanner(System.in);
		
System.out.println("Lutfen sayinin baslangic degerini yaziniz");
int bas =scan.nextInt();
System.out.println("Lutfen sayinin bitis degerini yaziniz");
int bit =scan.nextInt();
if(bas>=bit) {
	System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");}
int sum = 0;

for(int i=bas;i<=bit;i++ ) {
	sum=sum+i;

}   System.out.println(sum);
scan.close();
		
		
		
	}

}
