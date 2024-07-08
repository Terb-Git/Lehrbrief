package UebAufg_Array;

public class UebArray {

	public static void main(String[] args) {
		int factor = 3;
		
		int []feld = new int[5];
		feld [0] = 0*factor;
		feld [1] = 1*factor;
		feld [2] = 2*factor;
		feld [3] = 3*factor;
		feld [4] = 4*factor;
	
for (int i= 0; i < feld.length; i++) {
	System.out.println("Ergebnis: " + feld[i] );
}
	}

}
