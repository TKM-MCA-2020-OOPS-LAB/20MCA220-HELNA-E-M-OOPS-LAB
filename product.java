

public class product {
	
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {

		product ob1 = new product();
		product ob2 = new product();
		product ob3 = new product();
		ob1.pcode = 123;
		ob1.pname = "acer";
		ob1.price = 29000;
		ob2.pcode = 124;
		ob2.pname = "dell";
		ob2.price = 38000;
		ob3.pcode = 125;
		ob3.pname = "hp";
		ob3.price = 35000;
		if(ob1.price<=ob2.price && ob1.price<=ob3.price)
			System.out.println(ob1.pname+" is having the lowest price");
		else if(ob2.price<=ob1.price && ob2.price<=ob3.price)
			System.out.println(ob2.pname+" is having the lowest price");
		else
			System.out.println(ob3.pname+"is having the lowest price");

	}
	
}
