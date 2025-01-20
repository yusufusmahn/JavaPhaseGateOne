public class Untitled {
    public static void main(String[] args){

    	int firstNumber = 6;
    	int secondNumber = 5;

    	if (firstNumber == secondNumber){
        	firstNumber = firstNumber;
		secondNumber = secondNumber;

    	}else if (firstNumber > secondNumber){
       		secondNumber = firstNumber;
   	}

    	else{
        	firstNumber = secondNumber;
    	}

	System.out.println(firstNumber);
	//System.out.println(secondNumber);

    }

}