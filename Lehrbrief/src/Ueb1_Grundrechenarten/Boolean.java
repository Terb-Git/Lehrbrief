package Ueb1_Grundrechenarten;

public class Boolean {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean c;
		boolean d;
		boolean e;
		int x = 5;
		int y = 6; 
		a=x<y; 
		b=y>x;
		c= (x == y);
		d= (x<y) || (x>y);
		e= (x == y) && (y>x);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}

/*Lösung
boolean b1 = true;
boolean b2 = false;

boolean result = b1 && b2;
System.out.println("AND: " + result);

result = b1 || b2;
System.out.println("OR: " + result);

result = !b2;
System.out.println("NOT: " + result);

result = !(b1 && b2) || b2;
System.out.println("Formel: " + result);

if (b1) {
	System.out.println("B1 ist wahr");
}
else {
	System.out.println("B1 ist falsch");
}

}
}
*/
