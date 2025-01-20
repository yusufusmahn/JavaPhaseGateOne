public class Question10 {
	public static void main(String[] args){
	
	int[] number = {1, 2, 3, 4, 5};

	int result = evenOdd(number);

	System.out.println(result);


	}


	public static int evenOdd(int[] number){

		int evenodd = 0;

		for(int i = 0; i < number.length; i++){
		
			if (number[i] % 2 == 0){
			
				number[i] = 1;
				evenodd = i;

			}else{
	
				number[i] = 0;
				evenodd = i;
			}


		}

		return evenodd;
	}


}