public class Question7 {
	public static void main(String[] args){

	int numbers = 123;

	System.out.println(reverse(numbers));
	
	}

	public static int reverse(int numbers){
		int reverse = 0;

		while(numbers != 0){

			int extraction = numbers % 10;
			reverse = 10 * reverse + extraction;
			numbers /= 10;
		}

		return reverse;

	}



}