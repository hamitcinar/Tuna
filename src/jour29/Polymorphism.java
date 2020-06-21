package jour29;

public class Polymorphism {

	public static void main(String[] args) {
		// Polymorphism => Coklu yapi 
					// Overloading ve Overriding ile bir method polymorphism haline getirilir.
					// Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
					//                Diger adi static polymorphim'dir.
					// Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
					//                Diger adi dinamic polymorphism'dir.
				Polymorphism obj =new Polymorphism();
		          obj.eat();
		          obj.eat("Tuna");
				  obj.eat(null, null);
				
			}
			
			public void eat() {
				System.out.println("Ye!");
			}
			//Overloading ile polymorphism
			public void eat(String name) {
				System.out.println(name + "Ye!");
			}
			public void eat(String name,String name1) {
				System.out.println("Ye! Ye!");
			}
		}
			class Yeni extends Polymorphism{
				public static void main(String[] args) {
					Yeni objy =new Yeni();
				     objy.eat();
				}
				//Overriding ile polymorphism
				public void eat() {
					System.out.println("Lutfen Ye!");
					super.eat("Tuna");
				}
				public void eat(String name,String name1) {
					System.out.println(name+" "+name1+" "+"Ye!");
					
			
				}
				


	}


