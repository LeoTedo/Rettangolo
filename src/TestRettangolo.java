
public class TestRettangolo {
	static Rettangolo r1= new Rettangolo(2,3,0,0);
	static Rettangolo r2= new Rettangolo(4,5,0,0);
	static Rettangolo r3= new Rettangolo(6,8,0,0);
	int bellarea=0;
	int perini=0;
	public static void main(String[] args) {
		stampaValoriPrima();
		ridimensiona();
		area();
		perimetro();
		stampaValoriPrima();
		porcodio();

	}



public static Rettangolo ridimensiona() {
r1.alt=10;
r1.base=10;
return r1;
}
public static void area() {
   r1.area=r1.base*r1.alt;
   r2.area=r2.base*r2.alt;
   r3.area=r3.base*r3.alt;
}
public static void porcodio() {
	int bellarea=r1.area+r2.area+r3.area;
	int perini=r1.peri+r2.peri+r3.peri;
	System.out.println("totale aree: "+bellarea);
	System.out.println("perini:"+perini);
}
public static void perimetro() {
	   r1.peri=r1.base*2+r1.alt*2;
	   r2.peri=r2.base*2+r2.alt*2;
	   r3.peri=r3.base*2+r3.alt*2;
	}
public static void stampaValoriPrima() {
	System.out.println("----------------");
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
}
}
