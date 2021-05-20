import java.util.Scanner;

	public class employe {

		int Empid;
		String name;
		double salary;
		String address;
        public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No of employees: ");
		n=s.nextInt();
		teacher t[]=new teacher[n];
		
		for(i=0;i<n;i++)
		{
			t[i]=new teacher();
			
		}
	    for(i=0;i<n;i++)
	    {
	    	t[i].display();
	    }
	}
		
	public employe()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter id : ");
		Empid=S.nextInt();
		System.out.println("Enter name : ");
		name=S.next();
		System.out.println("Enter salary : ");
		salary=S.nextDouble();
		System.out.println("Enter address : ");
		address=S.next();	
	}
	}
	class teacher extends employe
	{
		String department;
		String subject;
		
	public teacher()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter department : ");
		department=s1.next();
		System.out.println("Enter subject : ");
		subject=s1.next();
	}
	void display()
	{
		System.out.println("*********************************");
		System.out.println("Employee id : "+Empid);
		System.out.println("Employee name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Employee address : "+address);
		System.out.println("Department : "+department);
		System.out.println("Subject : "+subject);
		
	}
	
}
