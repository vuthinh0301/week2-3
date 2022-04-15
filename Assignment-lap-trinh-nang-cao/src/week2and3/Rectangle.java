package week2and3;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width + height);
	}
	
	public static void main(String[] args) {
		Rectangle myRect1 = new Rectangle(3, 2);
		Rectangle myRect2 = new Rectangle(4.5, 5.6);
		System.out.println("The area of the rectangle is "+ myRect1.getArea());
		System.out.println("The perimeter is "+ myRect1.getPerimeter());
		System.out.println("The area of the rectangle is "+ myRect2.getArea());
		System.out.println("The perimeter is "+ myRect2.getPerimeter());
	}
}
