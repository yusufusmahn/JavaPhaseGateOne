public class Question5{

	public static boolean primeNumber(int number){
		if(number % 2 == 0){

		return true;

		}else{

		return false;
	
		}
	}


	public static int factorOf(int number){
		int j = 1;
		for (int i = 1; i < number; i++){
		if (number % j == 0){

		j++;
		
		}

		}

		return j;
	}
		


	public static void main(String[] args){

	System.out.println(primeNumber(3));
	System.out.println(factorOf(24));


	}


}














