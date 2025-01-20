import java.util.Arrays;

public class Question4 {
	public static void main(String[] args){

		int [] numbers = {1, 4, 6, 2, 5};

		System.out.println(Arrays.toString(descending(numbers)));

	}


	public static int[] descending(int[] numbers){
		int[] count = new int[5];
		
		for (int i = 0; i < numbers.length; i++){

			for(int j = i + 1; j < numbers.length; j++){
		
				if(numbers[i] > numbers[j]){
			
					count = [i][j];


				}
			}

		}

		return count;
	}







}