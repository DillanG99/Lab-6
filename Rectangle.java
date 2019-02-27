
public class Rectangle extends Polygon {
	private double height;
	private double width;
	
	/**
	 * Creates a Rectangle object of set height and width with a user specified ID
	 * @param id
	 * @param height
	 * @param width
	 */
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}
	/**
	 * Calculates the area of the rectangle (height * width) of the rectangle object
	 */
	@Override
	public double getArea() {
		return height * width;
	}
	/**
	 * @return A String respresentation of the type of shape the object is in this case: "Rectangle"
	 */
	@Override
	public String getShapeType() {
		return "Rectangle";
	}

}
