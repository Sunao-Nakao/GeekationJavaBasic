package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 9 ;
		
		boolean isGreaterA = a > b ;
		System.out.println(isGreaterA);
		
		boolean isSunny = true;
		boolean isWarm =true;
		
		if (isSunny && isWarm){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		int x = 1 ;
		int y = 10 ;
		boolean evenNumber = (y % 2 == 0);
		boolean andResultA = (x >= 0 && evenNumber );
		System.out.println(andResultA);
		
		boolean hasPermission = !(false);
		System.out.println(hasPermission);
		
	}

}
