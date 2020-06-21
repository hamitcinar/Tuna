package jour26;

public class Encapsulation {

	private int okulNo = 4556;
	private String okulAdi= "Yamanlar";
	private boolean mezun = true;
	public static void main(String[] args) {
		// 

	}
    public int getOkulNo() {
	 return okulNo;
 }
    public void setOkulNo(int X) {
    	this.okulNo = X;
    }
	public boolean isMezun() {
		return mezun;
	}
	public void setMezun(boolean mezun) {
		this.mezun = mezun;
	}
	public String getOkulAdi() {
		return okulAdi;
	}
    
}
