package jour28;

public class Mammal extends Animal {

	public boolean dogum = true;
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
      //Mammal mammal01 =new Mammal(15);
		mammal.move();
        
	}

	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal(){
		this(11);   //Parent deki paremetresiz constructoru cagir demektir.
		           // super() keyword unu kullanmasanizda olur ama bazilari kullanir sasirmayin.
		          //super() kullanilacaksa mutlaka ilk satirda olmalidir
		         //super() ve this() ayni constructor icinde ayni anda kullanilamaz
		        //cunku ikisininde ilk satirda olma zorunlulugu var
		System.out.println("Mammal parametresiz constructor");
	}
	Mammal (int age) {
		super();
		System.out.println("Parametreli mammal");
	}
	public void move() {
		System.out.println("Yuzer, ucar , kosar");
	}
}
