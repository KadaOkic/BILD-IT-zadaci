/**
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 */
package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

import zadaci_23_08_2016.MyPoint;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// asking user for number of points
		System.out.print("Enter the number of the points: ");
		int numOfPoints = input.nextInt();

		System.out.print("Enter the coordinates of the points: ");
		// arrayList MyPoint new which will be used to store coordinates
		ArrayList<MyPoint> points = new ArrayList<>();
		// storing coordinates in the arrayList
		for (int i = 0; i < numOfPoints; i++) {
			points.add(new MyPoint(input.nextDouble(), input.nextDouble()));
		}

		System.out.println("The total area is " + getConvexPolygonArea(points));
		input.close();
	}

	// metod to get area of a Convex Polygon
	public static double getConvexPolygonArea(ArrayList<MyPoint> points) {
		// points must be counter clockwise
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < points.size(); i++) {
			int limitIndex = (i + 1) % points.size();
			MyPoint p1 = points.get(i);
			MyPoint p2 = points.get(limitIndex);
			sum1 += (p1.x * p2.y);
			sum2 += (p1.y * p2.x);
		}

		double area = 0.5 * (sum1 - sum2);
		return (area > 0) ? area : -area;
	}

}
