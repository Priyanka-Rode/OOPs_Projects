//Shape Area Calculator (Circle/Square/Rectangle abstraction)

abstract class Area{
	abstract void allArea();
}

class CircleArea extends Area{
	int radius = 5;
	@Override
	void allArea(){
		 double area = 3.14 * radius * radius;
		System.out.println("Area of circle is :" + area);
	}
}

class SquareArea extends Area{
	int side=4;
	@Override
	void allArea(){
		int area = side * side;
		System.out.println("Area of Square is :" + area);
	}
}

class RectangleArea extends Area{
	int length = 6;
    int width = 3;
	@Override
	void allArea(){
		int area = length * width;
		System.out.println("Area of Rectangle is :" + area);
	}
}


public class AreaCalculator{
	public static void main(String[] args) {
		Area a;

        a = new CircleArea();
        a.allArea();

        System.out.println("-------------------------");

        a = new SquareArea();
        a.allArea();

        System.out.println("-------------------------");

        a = new RectangleArea();
        a.allArea();
	}
}