
public class MyFirst {

	public static int AddValues(int A, int B){
		int Sum = A + B;
		return Sum;
	}
	
	public static int Calculator(String Operator, int A, int B){
		int Result = 0; 
		switch(Operator){
			case "add": Result = A + B; break;
			case "sub": Result = A - B; break;
			case "multiply": Result = A * B; break;
			
		}
		return Result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Boston");
		int result = AddValues(3,6);
		System.out.println(result);
		result = Calculator("add",3,6);
		System.out.println("Add: " + result);
		result = Calculator("sub",3,6);
		System.out.println("Sub: " + result);
		System.out.println("Multiply: " + result);
		
		eCalculator MyCalc = new eCalculator();
		result = MyCalc.MyCalculator("add", 2, 7);
		System.out.println("add extern: " + result);
		
	}

}
