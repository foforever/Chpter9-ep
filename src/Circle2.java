
public class Circle2 {
	/**The radius of the circle*/
	double radius;
	
	/**The number of object created*/
	static int numberOfObjects=0;
	
	/**Construct a circle with radius 1*/
	Circle2(){
		radius=1;
		numberOfObjects++;
	}
	
	/**Construct a circle with a specified radius*/
	Circle2(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	/**Return numberOfObject*/
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/**Return the area of this circle*/
	double getArea() {
		return radius*radius*Math.PI;
	}
}
