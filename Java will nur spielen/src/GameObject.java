interface GameObject extends Movable, Paintable {
	double getWidth();

	double getHeight();

	Vertex getPos();

	Vertex getDeltaPos();

	void setDeltaPos(Vertex x);

	boolean isLargerThan(GameObject that);

	boolean isAbove(GameObject that);

	boolean touches(GameObject that);
	
	boolean isLeftof(GameObject that);

}