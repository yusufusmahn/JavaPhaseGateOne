public class Question1 {
    public static void main(String[] args){

        string word= "Hello World";

	int result = checkLength(word);

	System.out.println(result);


    }

    public static int checkLength(string word){
	int count = 0;
	int leftHandLength = 0;
	int righthand = word.length();


	while(leftHand != rightHand){
	    if (word.CharAt(leftHand) != word.CharAt(rightHand)){
		count++;
	
	    }

		lefthand++;
		righthand--;	
	 }

		return count;
    }


}