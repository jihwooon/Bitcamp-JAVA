class Class A {
	public int getValue() {
		int value =0;
		boolean setting = true;
		String title = "Hello";
		if(value || (setting && title == "Hello")) {return 1;}
		if(value == 1 & title.equals("Hello")) {return 2;}
		
		
		
	}
	
	
}

public class Class B
{
	public static void main(String args[]) {
		ClassA a = new ClassA();
		a.getValue();
		
		
	}
	
	
}