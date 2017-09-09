
public class Triangle {
	private double x1, y1, x2, y2, x3, y3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		assert (this.area() > 0.00001);
	}

	public double area() {
		double area = ((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) / 2;
		if (area < 0)
			area = -area;
		return area;
	}

	public static void main(String[] args) {
		Triangle t = new Triangle(1.0, 1.0, 2.0, 2.0, 3.0, 3.0);
		System.out.println("The area of our triangle is " + t.area());
	}

}
