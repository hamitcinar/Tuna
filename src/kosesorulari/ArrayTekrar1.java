package kosesorulari;

import java.util.Arrays;

public class ArrayTekrar1 {

	public static void main(String[] args) {
		// Integer bir Array olusturalim
		//sayilar1,2,3,4,5,6,7,8,9 olsun
		
		int num []= {1,2,3,4,5,6,7,8,9};

	    //1. Array in tum elemanlarini yazdiriniz
		Arrays.toString(num);
		System.out.println(Arrays.toString(num));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

		//2.Array in icindeki 5.index deki elemani yazdirin
		//num[index] yazdigimiz indexdeki elemani bize gosterir
		
		System.out.println(num[5]);//6
		
		//3.Array daki 3. index ile 6. index deki degerleri toplayan kodu yaziniz.
		int sum =0;
		sum =num[3]+num[6];
		System.out.println(sum);//4+7=11
		
		//4.Array daki son elemani yazdiriniz
		
		int son= num.length-1;
		System.out.println(num[son]);//11
		
		//5. Array in sondan 2. elemanini yazdirin
		
		int sondaniki = num.length-2;
		
		System.out.println(num[sondaniki]);//8
		
		//6. Array in icerisinde 6 varsa indexini yaziniz
		
		Arrays.binarySearch(num, 6);// binary icine once nerede sonra ne arayacagiz diye yaziyoruz
		System.out.println(Arrays.binarySearch(num, 6));//5. index de 6 varmis
		
		//7. Array daki eleman sayisini bulunuz
		
		int eleman= num.length;
		
		System.out.println(eleman);
		
		
		//8. Array da 111 olup olmadigini kontrol ediniz
		
		Arrays.binarySearch(num, 111);
		System.out.println(Arrays.binarySearch(num, 111));//-10 111 yok olsa 10.sirada olurdu
		
		//9. Array a 15 nolu elemani ekleyiniz
		
	   //NOT/ Elastik olmadigi icin ekleme cikarma yapamayiz
		
			
		//10.Array daki tek sayilari ve cift sayilari ayri ayri yazdirin
		/*int sum1  =0;
		int sum2=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				sum2++;
				System.out.print("cift sayilar"+num[i]);
				System.out.println();
		}else {
			sum1++;
			System.out.print("tek sayilar"+num[i]);
			System.out.println();
		}
			
		}System.out.println(sum1);//5
		System.out.print(sum2);//4*/
		
		//11. Array in icinde ayni eleman dublikation varmi diye bakacagiz.
		
		int sum1=0;
	     for (int i = 0; i < num.length; i++) {
	        for (int j = i+1; j < num.length; j++) {
	            if(num[i]==num[j]) {
	                sum1++;
	                System.out.println(num[i]);
	            }
	        }
	    }if(sum1>0) {
	        System.out.println("Var");
	    }else {
	        System.out.println("Yok");
	    }







		
		
		
		
		
		
	}

}
