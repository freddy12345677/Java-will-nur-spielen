
public class GeometricObject {

	public double width;
	public double height;
	public Vertex pos;

	public GeometricObject(double width, double height, Vertex pos) {
		this.height = height;
		this.width = width;
		this.pos = pos;

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}
		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}

	public GeometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0));
	}

	public GeometricObject(double w) {
		this(w, w);
	}
	public GeometricObject() {
		this(10);
	}
	public String toString() {
		return "width =" + width //hier fehlt etwas nachholen schaue teams
	}
}