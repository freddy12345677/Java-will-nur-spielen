
public class TestVertex {

	public static void main(String[] args) {
		int i = 0;
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0); 
		Vertex v3 = v1.skalarMult(42.42);
		
		System.out.println(v2);
		System.out.println(v1);
		System.out.println(v2.length()); // für mir mal von v2, length aus(methode)
		
		
	}

}
