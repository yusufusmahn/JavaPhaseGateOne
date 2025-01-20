import java.util.Arrays;

public class Question3 {
    public static void main(String[] args){

	int[] numbers = {6, 4, 1, 4, 6};

	System.out.println(check(numbers));


	}




	public static int check(int[] numbers){

		int find = 0;

		for(int i = 0; i < numbers.length; i++){

			for (int j = (i + 1); j < numbers.length; j++ ){
		
				if (numbers[i] != numbers[j]){
						
					find = numbers[i];
				} 
			 }
	 	}

		return find;

	}



}