package trainingAssigment_SDET;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter the width of the Triangle:");
	      double base = scanner.nextDouble();

	      System.out.println("Enter the height of the Triangle:");
	      double height = scanner.nextDouble();

	      //Area = (width*height)/2
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);      


	}

}
