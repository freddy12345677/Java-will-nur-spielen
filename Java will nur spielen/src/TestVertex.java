
public class TestVertex {

	public static void main(String[] args) {
		String s1 = "hallo";
		String s2 = "hallO".toLowerCase();
		Vertex v1 = new Vertex(17, 4);   //das sind alles OBjekte
		Vertex v2 = new Vertex(42, 23); 
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);
		
		
		//
		Vertex katze = new Vertex(1,1);
		Vertex v5 = v1.skalarMult(42.42);
		//
		
		
		
		
		System.out.println(v2.length()); // f�r mir mal von v2, length aus(methode)
		
		
		
		
		System.out.println(v2.toString());
		System.out.println(v2);
		System.out.println(v1.length());
		System.out.println(v2.length());
		System.out.println(v3.length());
		System.out.println(v1.skalarMult(0.8));
		System.out.println(v1);
		System.out.println(v1.add(v2));
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v2.equals(v3));
		System.out.println(v2.equals(v4));
		System.out.println(v2.equals(v2)); //ausgabe das was in den operatoren oder funktionen kp genau was da returnt wird
		
		
		System.out.println("distance "+ v2.distance(v1));
		
		System.out.println("get X " + v2.getX());
		
		
		
	}

}
//awdoiuf