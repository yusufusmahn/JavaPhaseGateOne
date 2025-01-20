public class Question7{

	public static int largestIndex(int[] number){
		int result;
		int max = number[0];
		for (int i = 0; i < number.length; i++){
			if(number[i] > max){
				max = number[i];

			}
		}
		
		return max;

	}


	
	public static boolean isTheSame(string name, string word){

	name = word.length() - 1;
	word = word.length() - 1;

	for (int i = 0; i < word.length(); i++){
	if (name.equalsword){
	return true;


	}
	}

	return false;


	}






	}




	public static void main(String[] args){

	int[] number = {1, 5, 3, 4, 5, 5};

	String name = "anagram";
	String word = "anagrama";


	System.out.println("maximum number is: "+largestIndex(number));



	}


}