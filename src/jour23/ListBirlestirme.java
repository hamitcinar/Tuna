package jour23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBirlestirme {

	public static void main(String[] args) {
		//2 list olusturun ve bunlari birlestirin
		//a- ilk listin sonuna ikinci listi ekleyin
		//b- ikinci listin 3. indexine 1. listi ekleyin
		//c- son olusan listin lenghtini bulunuz
		//d- birlestirilmis listin son elemaninin silin
		//d1- ilk listin 4. elemanini 49 yapin
		//d2- ikinci listte 20 var mi diye bakalim
		//d3- olusan iki listi de kucukten buyuge siralayiniz
		//d4- ikinci listedeki elemanlari toplayin
		//d5- ikinci listenizdeki ayni elemanlari toplayin
		//e- list1i komple silin
		//f- list bos mu diye kontrol edin
		
		List<Integer> list1 =new ArrayList<>();
		
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		
		List<Integer> list2 =new ArrayList<>();
		list2.add(20);
		list2.add(21);
		list2.add(22);
		list2.add(23);
		
		//a
		list1.addAll(list2);
		System.out.println(list1);//[10, 11, 12, 13, 20, 21, 22, 23]
		
		//b
		list2.addAll(3, list1);
		System.out.println(list2);//[20, 21, 22, 10, 11, 12, 13, 20, 21, 22, 23, 23]
		//c
		int uzunluk =list1.size();
		System.out.println(uzunluk);//8
		
		//d
		System.out.println(list2.remove(list2.size()-1));//23 silinen elemani yazdirir
		System.out.println(list2);//[20, 21, 22, 10, 11, 12, 13, 20, 21, 22, 23]
		
		//d1 eleman degistirme
		
		list1.set(3,49);
		System.out.println(list1);//[10, 11, 12, 49, 20, 21, 22, 23]
		
		//d2
		list2.contains(20);
		
		System.out.println(list2.contains(20));//true
		
		//d3
		
		Collections.sort(list1);
		System.out.println(list1);//[10, 11, 12, 20, 21, 22, 23, 49]
		
		Collections.sort(list2);
		System.out.println(list2);//[10, 11, 12, 13, 20, 20, 21, 21, 22, 22, 23]
		
		//d4
		
		int sum = 0;
		
		for(int w : list2) {
			 sum=sum+w;
		}System.out.println(sum);//195
		
		//d5
		
		list2.get(5);
		System.out.println(list2.get(5));//20  ==> 5. index teki sayi
		int sum1=0;
		
		for (int i = 0; i <list2.size(); i++) {  // 0 indexteki 10 dan baslayip donecek
			for (int j =i+ 1; j < list2.size(); j++) {//i =0 icin j=1 oda 1.index  teki sayi olan 11 i getirir
				if(list2.get(i)==list2.get(j)) { 
					sum1=sum1+list2.get(i);
				}
			}
		}System.out.println(sum1);//63
		
		//e
		list1.clear();
		System.out.println(list1);//[]
		
		//f
		
		list1.isEmpty();
		System.out.println(list1.isEmpty());//true
	}

}