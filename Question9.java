public class Question9 {
	public static void main(String[] args){

	int number = 10;

	int result = primeNumber(number);
	System.out.println(result);


	}

	public static int primeNumber(int number){

		int j = 0;

		for(int i = 2; i < number; i++){
			if (i % 1  == 0){
				if (i % i  == 0){

				j++;

				}
			}

		}

		return j;


	}


}