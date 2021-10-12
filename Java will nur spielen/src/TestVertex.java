//------------------------Functions-------------------------------------
//1. public "rückgabe-wert[möglichkeiten: void,String,int,...]" "Funktionsname" ("mitgabe wert1","mitgabe Wert2","...",){
//function)
//}

//2. private "rückgabe-wert[möglichkeiten: void,String,int,...]" "Funktionsname" ("mitgabe wert1","mitgabe Wert2","...",){
//function)
//}

//public = jeder kann zugreifen
//private = nur du kannst zugreifen (nicht eine andere klasse, nur die in der der Code steht)
//------------------------Functions-------------------------------------










public class TestVertex {

	public static void main(String[] args) {
		String s1 = "hallo";
		String s2 = "hallO".toLowerCase();
	Vertex v1 = new Vertex(17, 4);   //das sind alles OBjekte
		Vertex v2 = new Vertex(42, 23); 
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);
		
		
//		//
//		Vertex katze = new Vertex(1,1);
//		Vertex v5 = v1.skalarMult(42.42);
//		//
//		
//		
//		
//		
//		//System.out.println(v2.length()); // für mir mal von v2, length aus(methode)
//		
//		
//		
//		
//		System.out.println(v2.toString());
//		System.out.println(v2);
//		System.out.println(v1.length());
//		System.out.println(v2.length());
//		System.out.println(v3.length());
//		System.out.println(v1.skalarMult(0.8));
//		System.out.println(v1);
//		System.out.println(v1.add(v2));
//		System.out.println(v2);//
//		System.out.println(v1.equals(v2));
//		System.out.println(v2.equals(v3));
//		System.out.println(v2.equals(v4));
//		System.out.println(v2.equals(v2)); //ausgabe das was in den operatoren oder funktionen kp genau was da returnt wird
//		
//		
//		System.out.println("distance "+ v2.distance(v1));
//		
		System.out.println("get X " + v2.getX());
		GeometricObject o1 = new GeometricObject(17,4, new Vertex(42,23));
		GeometricObject o2 = new GeometricObject(17,4);
		GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();
		
		System.out.println(o1.equals(o2));
		o2.moveTo(42, 23);
		System.out.println(o1.equals(o2));
		System.out.println(o4);
		System.out.println(o3.contains(new Vertex(10,3)));
	}

}
//awdoiuf