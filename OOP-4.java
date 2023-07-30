import java.util.*;

public abstract class Shape {
	
		public static double a,b;
		
		public void getData() {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value of 1-dimension: ");
			 b=sc.nextDouble();
			System.out.print("Enter the value of 2-dimension: ");
			 a=sc.nextDouble();
		} 
		public abstract void cal_area();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=1;
		while(z!=0) {
           int choice;
           System.out.print("Enter your choice:\n 1. Traingle\n 2. Rectangle \n 3. Circle \n 4. Exit\n");
           choice=sc.nextInt();
           switch(choice) {
           case 1:{
        	   Triangle t=new Triangle();
        	   t.cal_area();
        	   break;
           }
           case 2:{
        	   Rectangle r=new Rectangle();
        	   r.cal_area();
        	   break;
           }
           case 3:{
        	   Circle c=new Circle();
   			   c.cal_area();
   			   break;
           }
           case 4:{
        	   z=0;
        	   System.out.println("Thank you!");
        	   break;
           }
           default: {
        	   System.out.print("Invalid choice!");
        	   break;
           }
           }
		}
	}

}
class Triangle extends Shape{
	public void cal_area() {
		 Triangle t=new Triangle();
		  t.getData();
		double result=(a*b)/2;
		System.out.println("Area of triangle: "+result);
	}
}
 class Rectangle extends Shape{
		public void cal_area() {
			Rectangle r=new Rectangle();
			r.getData();
			double result=(a*b);
			System.out.println("Area of rectangle: "+result);
		}
}
 class Circle extends Shape{
		public void cal_area() {
			Circle c=new Circle();
			c.getData();
			double result=(a*3.14*a);
			System.out.println("Area of circle: "+result);
		}
 }