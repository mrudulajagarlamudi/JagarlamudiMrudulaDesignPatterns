package Structual;

public abstract class Shape {
protected color color;
	
	//constructor with implementor as input argument
	public Shape(color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}
