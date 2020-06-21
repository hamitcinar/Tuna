package jour26;

public class Parisien extends Ville {

	public int argent = 2000;
	protected String mode = "formidable";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void metro () {
	System.out.println("tgv");
 }
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
}
