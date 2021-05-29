import java.util.Scanner;

class Students {
	String name;
	int roll_no,phy,chem,math,eng,bio,hin;
	Scanner st=new Scanner(System.in);
	
	public Students()
	{
		System.out.println("Enter your name: ");
		name=st.next();
		System.out.println("Enter Roll No: ");
		roll_no=st.nextInt();
		System.out.println("Enter your marks for the following subjects: ");
		System.out.println("Physics: ");
		phy=st.nextInt();
		System.out.println("Chemistry: ");
		chem=st.nextInt();
		System.out.println("Mathematics: ");
		math=st.nextInt();
                System.out.println("English: ");
		eng=st.nextInt();
                System.out.println("Biology: ");
		bio=st.nextInt();
                System.out.println("Hindi: ");
		hin=st.nextInt();
	}
}
	class Sports extends Students
	{
		int sprt;
		Scanner sp=new Scanner(System.in);
		
		public Sports()
		{
			System.out.println("Enter Sports score: ");
			sprt=sp.nextInt();
		}
	}
		class Result extends Sports
		{
			int totl;
			
			public Result()
			{
				totl=phy+chem+math+bio+eng+hin;
			}
			void display()
			{
				System.out.println("*****Academic Details*****");
				System.out.println("Name : "+name);
				System.out.println("Roll No : "+roll_no);
				System.out.println("Physics : "+phy);
				System.out.println("Chemistry : "+chem);
				System.out.println("Mathematics : "+math);
                                System.out.println("English : "+eng);
                                System.out.println("Biology : "+bio);
                                System.out.println("Hindi : "+hin);
				System.out.println("Total mark : "+totl);
				System.out.println("****************************");
				System.out.println("Sports score : "+sprt);
                                System.out.println("****************************");
			}
		}
public class student
{
	public static void main(String[] args)
	{
		Result obj=new Result();
		obj.display();
	}

}
