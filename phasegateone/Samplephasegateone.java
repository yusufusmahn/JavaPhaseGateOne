public class Sample{

	public string count(string word, string letter){

	int result = 0;
	for (int letter = 0; letter < word.length; letter++){

		if (letter.equalsword("l")){

		result++;

		}
	}

	return result;
	
	}



	public static main void(String[] args){

	String word = "Hello World";
	String letter = "l";

	int output = count(word, letter);

	System.out.println("output is: "+output);


	}


}