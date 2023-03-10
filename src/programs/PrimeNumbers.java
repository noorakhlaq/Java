package programs;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num = 84613;
		int count = 0;

		for (int i = 2; i < num-1; i++) {
			
			if(num%i==0) {
			
				count = count + 1;
				
				
			}
			
		}if(count==0) {
			System.out.println("prime numbers");
		}else {
			System.out.println("not prime");
		}
		
	}

}