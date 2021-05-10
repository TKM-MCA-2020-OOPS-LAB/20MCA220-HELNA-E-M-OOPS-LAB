
import java.util.Scanner;

public class overload {

	  double area;
	  
		double area(int l,int w)
		{
			area=l*w;
			System.out.println("Area of rectangle:" +area);
			return area;	
		}
		double area(int r)
		{
			area=3.14*r*r;
			System.out.println("Area of circle:" +area);
			return area;
		}
		double area()
		{
                        Scanner c2=new Scanner(System.in);
			System.out.println("Enter base and height of triangle: ");
			int b=c2.nextInt();
                        int h=c2.nextInt();

			area=0.5*b*h;
			System.out.println("Area of triangle :" +area);
			return area;
			
		}

		public static void main(String[] args) {
			overload obj = new overload();
			Scanner c=new Scanner(System.in);
			System.out.println("enter the length and breadth of rectangle:");
			int l=c.nextInt();
			int w=c.nextInt();
                        obj.area(l,w);
			System.out.println("Enter the radius of circle:");
			int r=c.nextInt();
			obj.area(r);
			obj.area();
			
			

		}
}
