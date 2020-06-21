package jour26;

public class Encapsulation1 {

	public static void main(String[] args) {
		// Encapsulation dan methodlari cagirin ve okul numarasini ve mezuniyet durumunu degistirin

		Encapsulation obje = new Encapsulation();
		obje.setOkulNo(125);
		obje.setMezun(false);
		
		System.out.println(obje.getOkulNo());
		System.out.println(obje.isMezun());
		System.out.println(obje.getOkulAdi());
		
	}

	
}
