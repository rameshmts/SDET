package trainingAssigment_SDET;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i=1;
        long fact = 1;
        while(i <= n)
        {
            fact *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", n, fact);


	}

}
