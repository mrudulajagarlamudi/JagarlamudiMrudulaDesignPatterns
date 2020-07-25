package Structual;

public class Bridge {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
	}
}
