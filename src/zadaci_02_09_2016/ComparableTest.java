package zadaci_02_09_2016;

public class ComparableTest {

	public static void main(String[] args) {
	
		//first circle object
		GeometricObject c1 = new Circle(1);
		//second circle object
		GeometricObject c2 = new Circle(3);
		//first rectangle object
		GeometricObject rec1 = new Rectangle(2, 2);
		//second rectangle object
		GeometricObject rec2 = new Rectangle(3, 3);
		//printing results of max object from GeometricObject class
		System.out.println("Bigger object is: "+ GeometricObject.max(c1, c2).toString());
		System.out.println("Bigger object is: "+ GeometricObject.max(rec1, rec2));



	}

}
