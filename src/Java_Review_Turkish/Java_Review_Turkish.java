package Java_Review_Turkish;

import java.util.Scanner;

public class Java_Review_Turkish {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		/*Asagdaki pascal ucgeninin ekrana yazdiran bir program yaziniz
	         1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1*/
		
		int num1 = 1;
		
		System.out.println("       1");
		System.out.println("      1  1");
		System.out.println("     1  2  1");
		System.out.println("    1  3  3 1");
		System.out.println("   1  4  6 4 1");
		
		/* A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A*/
		
		
		System.out.println("      A");
		System.out.println("     B B");
		System.out.println("    C   C");
		System.out.println("   D     D");
		System.out.println("  E       E ");
		System.out.println(" F         F");
		System.out.println("  E       E");
		System.out.println("   D     D");
		System.out.println("    C   C");
		System.out.println("     B B");
		System.out.println("      A");
		
		
		
		System.out.println((char)34+"Sagligin icin evde kal"+ (char)34);
		
		System.out.println("Sagligin icin \"evde kal\".");
		
		//Would you like 'coffe' or 'tea'?
		
		System.out.println("Would you like \'coffee\'or\'tea/'?");
		
		//double 10.231 i int’e çevirip ekrana yazdiriniz.e 10.231 i int’e çevirip ekrana yazdiriniz. 
		
		double db = 10.231;
		int i =(int) db;
		System.out.println(i);
		
		int a=11;
		int b=5;
		double pi=3.14;
		/*a*b=?
		a*pi=?
		b/a=?
		a*b/pi=?
		a+b+pi=?
		a+b=?
		a-b=?
		-pi/a=?
		(a+b)/pi=?
		(b/pi)*a=?*/
		
		
		System.out.println("a*b= "+a*b);
		System.out.println("a*pi= "+a*pi);
		System.out.println("b/a= "+b/a);
		System.out.println("a*b/pi= "+ a*b/pi);
		System.out.println("a+b+pi= "+(a+b+pi));
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("-pi/a= "+(-pi/a));
		System.out.println("(a+b)/pi= "+(a+b)/pi);
		System.out.println("(b/pi)*a= "+(b/pi)*a);
		
		/*hi 21
		hi Harun
		5TechProEd203
		TechProEd305
		7TechProEd305*/
		
		System.out.println("hi "+21);
		System.out.println("hi "+"Harun");
		System.out.println(2+0+3+"TechProEd"+2+0+3);
		System.out.println("TechProEd"+3+0+5);
		System.out.println(2+0+5+"TechProEd"+"305");
		
		/*a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3*/
		
		
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		
		
		int num=10;
		num+=100;
		
		System.out.println(num);
		
		System.out.println(Math.pow(2, 3));  //uslu sayilar
		
		System.out.println(Math.sqrt(144));//karakok alir
		
		System.out.println(Math.sqrt(81));
		
		System.out.println(Math.round(3.14)); //yuvarlama yapar virgul gider
		
		//Dikdörtgenin alanını ve çevresini bulunuz
		//çevre = 2*(boy + en)
		//alan = en * boy
		
		double en = 5.6;
	    double boy = 8.5;
		
		System.out.println("cevre="+2*(8.5+5.6));
		
		System.out.println("alan="+8.5*5.6);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen dikdortgenin boy uzunlugunu giriniz");
		
		int boyu = scan.nextInt();
		
		System.out.println("lutfen dikdortgenin en uzunlugunu giriniz");
		
		int eni = scan.nextInt();
		
		int alan= eni*boyu;
		
		int cevre= 2*(eni+boyu);
		
		System.out.println("Alan= "+alan);
		System.out.println("cevre= "+cevre);
		
		//Scanner ile kullanıcıdan 3 sayı girmesini isteyin ve bu sayıların toplamını yazdırınız.
		
	
		
		
		
		System.out.println("lutfen uc sayi giriniz");
		
		Scanner scan1 = new Scanner(System.in);
		
		int nu1,num2,num3,toplam;
		
		System.out.println("lutfen birinci sayi giriniz");
		nu1=scan.nextInt();
		System.out.println("lutfen ikiinci sayi giriniz");
		num2=scan.nextInt();
		System.out.println("lutfen ucuncu sayi giriniz");
		num3=scan.nextInt();
	
		toplam=nu1+num2+num3;
		
		System.out.println("uc sayinin toplami="+toplam);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
