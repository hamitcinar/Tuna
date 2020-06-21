package jour21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {


		List <Integer> list = new ArrayList<>();
		
		list.add(14);
		list.add(19);
		list.add(16);
		list.add(23);
		list.add(18);
		System.out.println(list);//[14, 19, 16, 23, 18]

 // indexi 2 olan elemani cikariniz, ekrana yazdiriniz
//indexi 0 olan sayiyi 20 ile degistirin
//kucukten buyuge dogru siralayiniz		
//liste kac elemandan olusuyor
		
		list.remove(2);
		list.set(0, 20);
		list.size();
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
	}

}
