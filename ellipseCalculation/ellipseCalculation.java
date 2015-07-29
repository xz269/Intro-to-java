import java.util.Scanner;

/**
 * Author:Xieqi Zhang
 * Program purpose:grabing data from the user and output the focus, area, and the circumference of the ellipse.
 */

import java.util.Scanner;

public class ellipseCalculation {
	public static void main(String[] args){
		double majorRadius,minorRadius;
		double focus;
		double area;
		double circumference;
//The focus of the ellipse
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the semi major radius:");
		majorRadius = scan.nextDouble();
		System.out.println("Please enter the semi minor radius:");
		minorRadius = scan.nextDouble();
		if (majorRadius >= minorRadius){
			focus = Math.sqrt(majorRadius*majorRadius-minorRadius*minorRadius);
			System.out.printf("The focus of the ellipse is: %.2f\n",focus);
//The area of the ellipse 
			area = Math.PI*majorRadius*minorRadius;
			System.out.printf("The area of the ellipse is: %.2f\n",area);
//The circumference of the ellipse
			circumference = Math.PI*(3*(majorRadius+minorRadius)-Math.sqrt(10*majorRadius*minorRadius+3*majorRadius*majorRadius+3*minorRadius*minorRadius));
			System.out.printf("The circumference of the ellipse is: %.2f",circumference);
		}else{
			System.out.println("The semi major radius and semi minor radius are input wrongly for the ellipse");
		}
	}
}
