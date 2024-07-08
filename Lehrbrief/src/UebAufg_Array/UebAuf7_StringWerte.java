package UebAufg_Array;

public class UebAuf7_StringWerte {

	public static void main(String[] args) {
		String [] adresse = new String[5];
		adresse[0] = "Thor";
		adresse[1] = "Maxstrasse";
		adresse[2] = "69000 Linsengericht";
		adresse[3] = "069 -001";
		adresse[4] = "Mail@";
		//adresse[5] = "MehrFeldalsdefinitiion";
		
	for(int i=0;i < adresse.length; i++) {
		
		System.out.println("Adresse:" + adresse[i]);
	}

	}

}
