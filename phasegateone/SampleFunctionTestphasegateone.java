
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SampleFunctionTest{
	public void TestThatFunctionWorks(){

		SampleFunction mySampleFunction = new SampleFunction();
		String number = "1210";



	}


	public void TestThatItIs(){
		SampleFunction mySampleFunction = new SampleFunction();

		int[] number = {1,3,2,3,2};
		int check = {1};

		int result = mySampleFunction.uniqueNumber(number,check);
		assertEquals(1, result);

	



	}






}
