
public class eCalculator {
	
	private static int eResult = 0;
		
	
	public void eCalculator(){
	}
	
	public static int MyCalculator(String Operator, int A, int B){
		switch(Operator){
			case "add": eResult = A + B; break;
			case "sub": eResult = A - B; break;
			case "multiply": eResult = A * B; break;
			
		}
		return eResult;
	}
}
