package jour26;

public class Francais extends Parisien{
     private boolean eropeen=true;
     private String sympha = "sympha";
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parisien obj = new Parisien();
		
		obj.setVoiture(3);
		obj.setArgent(1800);
		obj.setMode("mode");
		obj.getMode();
		System.out.println(obj.getMode());
	
	}
     public void setEropeen (boolean eropeen) {
	   this.eropeen= eropeen;
}
     public void getSympha() {
    	 this.getSympha();
     }
     
}
