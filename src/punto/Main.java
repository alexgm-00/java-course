package punto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto  P1= new Punto(5,0);
		Punto  P2= new Punto(10,10);
		Punto  P3= new Punto(-3,7);
		
		System.out.println(P1.x+","+P1.y*1);
		System.out.println(P1.x+" + "+P1.y*1+" = "+(P1.x+P1.y));
		System.out.println(P2.x+","+P2.y*1);
		System.out.println(P2.x+" * "+P2.y*1+" = "+(P2.x*P2.y));
		System.out.println(P3.x+","+P3.y*1);
		System.out.println(P3.x+" - "+P3.y*1+" = "+(P3.x-P3.y));
	}

}
