import java.util.Scanner;

public class Rettangolo {
public int base=0;
public int alt=0;
public int peri=0;
public int area=0;
public Rettangolo(int base, int alt, int peri, int area) {
	super();
	this.base = base;
	this.alt = alt;
	this.peri=peri;
	this.area=area;
}

@Override
public String toString() {
	return "base: " + base + " altezza: " + alt + " perimetro: " + peri + " area: " + area + " ";
}

}
