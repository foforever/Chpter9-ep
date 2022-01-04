
public class TestCircleWithStaticMembers {
	/**Main method*/
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is "+
		Circle2.numberOfObjects);
		
		//Create c1
		Circle2 c1=new Circle2();//Use the Circle class in Listing 9.6
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + 
				c1.numberOfObjects + ")"); 
		
		//Create c2
		Circle2 c2=new Circle2(5);
		
		//Modify c1
		c1.radius=9;
		
		//Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + 
				c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
				c2.numberOfObjects + ")");
		
	}
}
