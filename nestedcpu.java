

class cpu 
{
	int price = 30000;
	public class processor
	{
		int cores = 6;
		String manufacturer = "intel";
	}
	
	  static class ram
	{
		int memory = 8;
		String manufacturer = "intel";
		
	}
}
	
public class nestedcpu
{

    public static void main(String[] args) {
 
		cpu obj1 = new cpu();
		cpu.processor obj2 = obj1.new processor();
		cpu.ram obj3 = new cpu.ram();
		
		System.out.println("Price= " +obj1.price);
		System.out.println("Number of cores= " +obj2.cores);
		System.out.println("Processor Manufacturer= " +obj2.manufacturer);
		System.out.println("Memory = " +obj3.memory);
		System.out.println("RAM Manufacturer = " +obj3.manufacturer);
	

	}

}
