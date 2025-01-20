import java.util.Scanner;

public class Question4 {
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("enter a number to check if it is a palindrome");	
		int numbers = keyboard.nextInt();
		if(numbers < 0){
			System.out.println("Invalid entry, kindly anter a positive number to check if it is a palindrome: ");	
			numbers = keyboard.nextInt();
		}

	
		boolean result = isPalindrome(numbers);
	
		System.out.println(result);

	}

	public static boolean isPalindrome(int numbers){
	
		int original = 0;
		int reverse = 0;
		original = number;

		while(numbers != 0){

			int extraction = numbers % 10;
			reverse = 10 * reverse + extraction;
			numbers /= 10;
		}

		if (reverse == original){

			return true;
		}
	
			return false;

		}

	}
