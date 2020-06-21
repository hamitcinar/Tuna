package kosesorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArrayListTekrar01 {

	public static void main(String[] args) {
		//1. intiger bir ArrayList olusturalim 

		List<Integer> list = new ArrayList<>();
		
		//liste eleman ekledik
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//2.list in elemanlarini yazdirin
		System.out.println(list);//[3, 4, 5, 6, 7]
		
		//3.list in 3. index indeki elemani yazdiriniz
		
		System.out.println(list.get(3));//6
		
		//4. list dolu mu diye kontrul ediniz
		
		list.isEmpty();
		System.out.println(list.isEmpty());//false
		
		//5. list te kac eleman var
		
		list.size();
		System.out.println(list.size());//5
		
		//6. liste 1 tane eleman ekleyelim
		list.add(8);
		System.out.println(list);//[3, 4, 5, 6, 7, 8]
		
		//7. listin 3.indexine 9 , 2. indexine 12 ekleyin.
		
		list.add(3, 9);
		list.add(2,12);
		
		System.out.println(list);//[3, 4, 12, 5, 9, 6, 7, 8]
		
		//8. listte eleman olarak 4 var mi varsa 11 ile degistirin
		
		list.contains(4);
		System.out.println(list.contains(4));//true
		list.indexOf(4);
		System.out.println(list.indexOf(4));//1. index te 
		
		//list.set(1,11);
		System.out.println(list.set(1,11));//4 silinen elemani yazdirdi
		System.out.println(list);//[3, 11, 12, 5, 9, 6, 7, 8]
		
		//9. list deki elemanlari kucukten buyuge dogru siralayiniz
		
		Collections.sort(list);
		System.out.println(list);//[3, 5, 6, 7, 8, 9, 11, 12]
		
		//10. listi tersten yazdiriniz
		
		for (int i =list.size()-1;i>=0; i--) {
			System.out.print(list.get(i)+" ");//12 11 9 8 7 6 5 3
		}
		System.out.println();
		//11.list deki tek ve cift sayilari ayri ayri yazdiriniz
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2==0) {
				System.out.print(list.get(i)+" ");
			}else{
				System.out.print(list.get(i)+" ");
			}
		}
	}

}
