public class Question1 {
    public static void main(String[] args){

	System.out.println(isPower(8));


    }

    public static boolean isPower(int n){

        
	if (n == 1){
	return true;

	}

	else if (n % 2 == 0){
	    return true;

        }else{
	return false;
	
	}
    


    }

}
