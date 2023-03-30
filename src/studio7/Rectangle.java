package studio7;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3, 3);
		System.out.println(r.length);
	}
}
