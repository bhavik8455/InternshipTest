package main;

class Area{
	
	
	int rectangle(int length , int breadth ) {
		
		return length*breadth;
	}
	
int rectangle(int length) {
		
	int breadth = 3;
		return length*breadth;
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Area area = new Area();
		
		System.out.println("Area of rectangle  "+ area.rectangle(20));
		System.out.println("Area of rectangle  "+ area.rectangle(10, 40));
		
		
	}

}
