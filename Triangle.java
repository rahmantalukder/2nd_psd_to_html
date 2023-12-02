package b_triangle;

public class Triangle {
	private int length;
	private int width;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	public Triangle(int l, int w, int h) {
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	public double area() {
		double rslt =.5*length*width*height;
		return rslt;
	}
	
	@Override
	public String toString() {
		return "This is Triangle Class";
	}
}
