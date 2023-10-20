public class Assignement3 {

	public static void main(String[] args) {
		String sentence = "Borjan is the best";
		char first_letter = sentence.charAt(0);
		char last_letter = sentence.charAt(sentence.length() - 1);
		
		int position;
		char middle_letter;
		if(sentence.length() % 2 == 0) {
			position = sentence.length() / 2;
			middle_letter = sentence.charAt(position - 1);
		}
		else {
			position = sentence.length() / 2;
			middle_letter = sentence.charAt(position);
		}
		
		int sum = (int)(first_letter + middle_letter + last_letter);
		
		char largest = 0;
		
		if(first_letter > middle_letter && first_letter > last_letter){
			largest = first_letter;
		}
		else if(middle_letter > first_letter && middle_letter > last_letter) {
			largest = middle_letter;
		}
		else if(last_letter > first_letter && last_letter > middle_letter) {
			largest = last_letter;
		}
		
		System.out.println("My string is " + sentence);
		System.out.println("It's first letter is " + first_letter);
		System.out.println("It's last letter is " + last_letter);
		System.out.println("It's middle letter is " + middle_letter);
		System.out.println("The sum of these letters is " + sum);
		System.out.println("The biggest letter of these all is " + largest + " with the position " + (int)largest );
	}
}
