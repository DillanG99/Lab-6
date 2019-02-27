
public class Square extends Rectangle {
	
	/**
	 * Creates a square object
	 * uses the recatangle constructo but sets both side lengths equal to each other
	 * @param id
	 * @param size
	 */
	public Square(String id, double size) {
		super(id, size, size);
	}
	/**
	 * @return A String respresentation of the type of shape the object is in this case: "Square"
	 */
	public String getShapeType() {
		return "Square";
	}
	
	
}
