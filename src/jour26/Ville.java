package jour26;

public class Ville extends Village {
  protected int voiture= 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void postCode() {
    	System.out.println("01100");
    }
	public int getVoiture() {
		return voiture;
	}
	public void setVoiture(int voiture) {
		this.voiture = voiture;
	}
}
